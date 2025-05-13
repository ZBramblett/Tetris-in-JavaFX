package zachsprojects.tetrisjavafx;

import javafx.scene.paint.Color;

public class O extends Tetrimino{
    public O(){
        this.shape = new int[][]{
                {4, 4, 0, 0},
                {4, 4, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        this.color = Color.YELLOW;
    }
}
