package zachsprojects.tetrisjavafx;

import javafx.scene.paint.Color;

public class L extends Tetrimino{
    public L(){
        this.shape = new int[][]{
                {1, 0, 0, 0},
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0}
        };
        this.color = Color.ORANGE;
    }
}
