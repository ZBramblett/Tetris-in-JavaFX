package zachsprojects.tetrisjavafx;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.util.Duration;

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
    Tetrimino T = new I();
    
    Timeline gravity = new Timeline(new KeyFrame(Duration.millis(750), event -> {
        gameBoard.removeShape(T); T.setCurrentRow(T.getCurrentRow() + 1);})
    );
    
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
        gameBoard.drawBoard(graphicsContext, 40);
        gameBoard.drawShape(T);
        
    }
    
    /**
     * This is where I get user input to move the pieces around
     * @param event the event parameter just takes in a key press I think.
     */
    private void handleKeyPresses(KeyEvent event) {
        switch (event.getCode()) {
            case UP: ; break;
            case DOWN: gameBoard.removeShape(T); T.setCurrentRow(T.getCurrentRow() + 1); break;
            case LEFT: gameBoard.removeShape(T); T.setCurrentCol(T.getCurrentCol() - 1); break;
            case RIGHT: gameBoard.removeShape(T); T.setCurrentCol(T.getCurrentCol() + 1); break;
            default: break;
        }
    }
    
}

