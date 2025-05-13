package zachsprojects.tetrisjavafx;

import javafx.scene.paint.Color;

public class L extends Tetrimino{
    public L(){
        this.shape = new int[][]{
                {3, 0, 0, 0},
                {3, 0, 0, 0},
                {3, 3, 0, 0},
                {0, 0, 0, 0}
        };
        this.color = Color.ORANGE;
    }
}
