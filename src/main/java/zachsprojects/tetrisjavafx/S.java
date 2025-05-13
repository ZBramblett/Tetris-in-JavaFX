package zachsprojects.tetrisjavafx;

import javafx.scene.paint.Color;

public class S extends Tetrimino {
    public S(){
        this.shape = new int[][]{
                {0, 5, 5, 0},
                {5, 5, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        this.color = Color.GREEN;
    }
}
