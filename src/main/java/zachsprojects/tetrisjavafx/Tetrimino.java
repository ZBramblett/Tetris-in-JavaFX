package zachsprojects.tetrisjavafx;

public abstract class Tetrimino {
    int[][] shape;
    int currentRow;
    int currentCol;
    
    public Tetrimino(){
    }
    
    public int[][] getShape(){
        return this.shape;
    };
    
    public int getCurrentRow(){
        return currentRow;
    }
    public int getCurrentCol(){
        return currentCol;
    }
    public void setCurrentRow(int currentRow){
        this.currentRow = currentRow;
    }
    public void setCurrentCol(int currentCol){
        this.currentCol = currentCol;
    }
}
