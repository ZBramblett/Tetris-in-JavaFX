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
    Tetrimino T = new T();
    
//    Timeline gravity = new Timeline(new KeyFrame(Duration.millis(750), event -> {
//        gameBoard.removeShape(T); T.setCurrentRow(T.getCurrentRow() + 1);})
//    );
    
    /**
     * This is the game loop.
     * @param l I don't know what this is
     */
    @Override
    public void handle(long l) {
        
        // Game loop
//        gravity.play();
        graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        graphicsContext.setFill(Color.LIGHTGRAY);
        graphicsContext.fillRect(0,0, canvas.getWidth(), canvas.getHeight());
        gameBoard.drawBoard(graphicsContext, 40);
        gameBoard.drawTetrimino(graphicsContext,T,40);
        
    }
    
    /**
     * This is where I get user input to move the pieces around
     * @param event the event parameter just takes in a key press I think.
     */
//    private void handleKeyPresses(KeyEvent event) {
//        switch (event.getCode()) {
//            case UP: T.moveShapeUp(); System.out.println(T.getCurrentCol()) ; System.out.println(T.getCurrentRow()); break;
//            case DOWN: T.moveShapeDown(); System.out.println(T.getCurrentCol()) ; System.out.println(T.getCurrentRow()); break;
//            case LEFT: T.moveShapeLeft();System.out.println(T.getCurrentCol()) ; System.out.println(T.getCurrentRow()); break;
//            case RIGHT: T.moveShapeRight();System.out.println(T.getCurrentCol()) ; System.out.println(T.getCurrentRow()); break;
//            default: break;
//        }
//    }
    private void handleKeyPresses(KeyEvent event){
        if (event.getCode() == LEFT){
            if(gameBoard.canMove(T, 0,-1, gameBoard.getGameBoard())){
                T.moveShapeLeft();
            }
        }
        if (event.getCode() == RIGHT){
            if(gameBoard.canMove(T, 0,+1, gameBoard.getGameBoard())){
                T.moveShapeRight();
            }
        }
        if (event.getCode() == DOWN){
            if(gameBoard.canMove(T, +1,0, gameBoard.getGameBoard())){
                T.moveShapeDown();
            }
        }

    }
    
}

