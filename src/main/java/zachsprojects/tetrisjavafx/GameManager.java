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
    Tetrimino tetrimino = new Tetrimino(100.00,100.00);
    TetrisBoard gameBoard = new TetrisBoard(20,10);
    
    @Override
    public void handle(long l) {
        // Game loop
        graphicsContext.setFill(Color.BLACK);
        graphicsContext.fillRect(0,0, canvas.getWidth(), canvas.getHeight());
        
        graphicsContext.setFill(Color.CYAN);
        graphicsContext.fillOval(tetrimino.getxPos(), tetrimino.getyPos(), 20,20);
    
    }
    
    private void handleKeyPresses(KeyEvent event) {
        switch (event.getCode()) {
            case UP: tetrimino.setyPos(tetrimino.getyPos() - 50); break;
            case DOWN: tetrimino.setyPos(tetrimino.getyPos() + 50); break;
            case LEFT: tetrimino.setxPos(tetrimino.getxPos() - 50); break;
            case RIGHT: tetrimino.setxPos(tetrimino.getxPos() + 50); break;
            default: break;
        }
    }
    
}

