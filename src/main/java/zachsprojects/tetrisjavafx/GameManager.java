package zachsprojects.tetrisjavafx;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class GameManager extends AnimationTimer {
    
    private GraphicsContext graphicsContext;
    private Canvas canvas;
    
    public GameManager(Canvas canvas, GraphicsContext gc){
    this.canvas = canvas;
    this.graphicsContext = gc;
    
    this.canvas.setOnKeyReleased(this::handleKeyPresses);
    
    this.canvas.setFocusTraversable(true);
    
    }
    
    TetrisBoard gameBoard = new TetrisBoard(20,10);
    Tetrimino T = new T();
    
    @Override
    public void handle(long l) {
        // Game loop
        graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        graphicsContext.setFill(Color.BLACK);
        graphicsContext.fillRect(0,0, canvas.getWidth(), canvas.getHeight());
        gameBoard.drawBoard(graphicsContext, 40);
        gameBoard.drawShape(T);
        
        
    }
    
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

