package zachsprojects.tetrisjavafx;

public abstract class Tetrimino {
    int[][] shape;
    
    public Tetrimino(){
    }
    
    public abstract int[][] getShape();
    
}
