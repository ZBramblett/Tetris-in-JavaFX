package zachsprojects.tetrisjavafx;

import javafx.scene.paint.Color;

public class O extends Tetrimino{
    public O(){
        this.shape = new int[][]{
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        this.color = Color.YELLOW;
    }
}
