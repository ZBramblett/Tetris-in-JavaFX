package zachsprojects.tetrisjavafx;

import javafx.scene.paint.Color;

public class T extends Tetrimino{
    public T(){
        this.shape = new int[][]{
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        this.color = Color.PURPLE;
    }
}
