package zachsprojects.tetrisjavafx;

public class I extends Tetrimino{
    
    public I(){
        this.shape = new int[][]{
                {0, 1, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 0, 0}
        };
    }
    
    @Override
    public int[][] getShape(){
        return shape;
    }
}
