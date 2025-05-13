package zachsprojects.tetrisjavafx;

import javafx.scene.paint.Color;

public class Z extends Tetrimino{
    public Z(){
        this.shape = new int[][]{
                {7, 7, 0, 0},
                {0, 7, 7, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        this.color = Color.RED;
    }
}
