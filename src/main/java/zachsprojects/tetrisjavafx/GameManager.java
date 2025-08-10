package zachsprojects.tetrisjavafx;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import static javafx.scene.input.KeyCode.*;

/**
 *  This is the GameManager class, this class is responsible for holding the gameloop as well as instantiation of my objects. It's also where I set up user input.
 */

public class GameManager extends AnimationTimer {
    
    private GraphicsContext graphicsContext;
    private Canvas canvas;
    
    public GameManager(Canvas canvas, GraphicsContext gc) {
        this.canvas = canvas;
        this.graphicsContext = gc;
        
        this.canvas.setOnKeyReleased(this::handleKeyPresses);
        
        this.canvas.setFocusTraversable(true);
        
    }
    
    TetrisBoard gameBoard = new TetrisBoard(20, 10);
    ShapeGenerator shapeGenerator = new ShapeGenerator();
    Tetrimino currentShape = shapeGenerator.pickRandomShape();
    
    Timeline gravity = new Timeline(new KeyFrame(Duration.millis(750), event -> {
        if (gameBoard.canMove(currentShape, +1, 0, gameBoard.getGameBoard())) {
            currentShape.moveShapeDown();
        }else{
            gameBoard.drawShapeToBoard(currentShape);
            currentShape = shapeGenerator.pickRandomShape();
        }
    }));


    /**
     * This is the game loop.
     * @param l I don't know what this is
     */
    @Override
    public void handle(long l) {
        
        // Game loop
        gravity.play();
        graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        graphicsContext.setFill(Color.LIGHTGRAY);
        graphicsContext.fillRect(0,0, canvas.getWidth(), canvas.getHeight());
        gameBoard.drawBoard(graphicsContext, 40, currentShape);
        gameBoard.drawTetrimino(graphicsContext,currentShape,40);
        gameBoard.clearLines();
        
    }

    private void handleKeyPresses(KeyEvent event){
        if (event.getCode() == LEFT){
            if(gameBoard.canMove(currentShape, 0,-1, gameBoard.getGameBoard())){
                currentShape.moveShapeLeft();
            }
        }
        if (event.getCode() == RIGHT){
            if(gameBoard.canMove(currentShape, 0,+1, gameBoard.getGameBoard())){
                currentShape.moveShapeRight();
            }
        }
        if (event.getCode() == DOWN){
            if(gameBoard.canMove(currentShape, +1,0, gameBoard.getGameBoard())){
                currentShape.moveShapeDown();
            }else{
                gameBoard.drawShapeToBoard(currentShape);
                currentShape = shapeGenerator.pickRandomShape();
            }
        }
        if (event.getCode() == UP){
            gameBoard.rotateShape(currentShape);
        }

    }
    
}

