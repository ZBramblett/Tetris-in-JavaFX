package zachsprojects.tetrisjavafx;

import javafx.scene.paint.Color;

import java.awt.*;

public class J extends Tetrimino{
    public J(){
        this.shape = new int[][]{
                {0, 2, 0, 0},
                {0, 2, 0, 0},
                {2, 2, 0, 0},
                {0, 0, 0, 0}
        };
        this.color = Color.BLUE;
    }
}
