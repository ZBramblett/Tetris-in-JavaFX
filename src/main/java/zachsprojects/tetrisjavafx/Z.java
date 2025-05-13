package zachsprojects.tetrisjavafx;

import javafx.scene.paint.Color;

public class Z extends Tetrimino{
    public Z(){
        this.shape = new int[][]{
                {1, 1, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        this.color = Color.RED;
    }
}
