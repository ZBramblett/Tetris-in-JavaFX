package zachsprojects.tetrisjavafx;

import javafx.scene.paint.Color;

public class T extends Tetrimino{
    public T(){
        this.shape = new int[][]{
                {6, 6, 6, 0},
                {0, 6, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        this.color = Color.PURPLE;
    }
}
