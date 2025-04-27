package zachsprojects.tetrisjavafx;

public class T extends Tetrimino{
    public T(){
        this.shape = new int[][]{
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
    }
}
