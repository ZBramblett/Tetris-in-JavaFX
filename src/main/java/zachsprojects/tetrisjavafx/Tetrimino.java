package zachsprojects.tetrisjavafx;

public abstract class Tetrimino {
    int[][] shape;
    
    public Tetrimino(){
    }
    
    public int[][] getShape(){
        return this.shape;
    };
    
}
