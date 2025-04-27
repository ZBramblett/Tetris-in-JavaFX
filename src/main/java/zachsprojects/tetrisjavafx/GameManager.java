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
    Tetrimino I = new I();
    
    @Override
    public void handle(long l) {
        // Game loop
        graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        graphicsContext.setFill(Color.BLACK);
        graphicsContext.fillRect(0,0, canvas.getWidth(), canvas.getHeight());
        gameBoard.drawBoard(graphicsContext, 40);
        gameBoard.drawShape(I);
        
        
    }
    
    private void handleKeyPresses(KeyEvent event) {
        switch (event.getCode()) {
            case UP: ; break;
            case DOWN: gameBoard.removeShape(I); I.setCurrentRow(I.getCurrentRow() + 1); break;
            case LEFT: gameBoard.removeShape(I); I.setCurrentCol(I.getCurrentRow() - 1); break;
            case RIGHT: gameBoard.removeShape(I); I.setCurrentCol(I.getCurrentRow() + 1); break;
            default: break;
        }
    }

    
}

