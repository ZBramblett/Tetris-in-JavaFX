package zachsprojects.tetrisjavafx;

import javafx.scene.paint.Color;

public class I extends Tetrimino{
    public I(){
        this.shape = new int[][]{
                {1, 0, 0, 0},
                {1, 0, 0, 0},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        };
        this.color = Color.CYAN;
    }
    
}
