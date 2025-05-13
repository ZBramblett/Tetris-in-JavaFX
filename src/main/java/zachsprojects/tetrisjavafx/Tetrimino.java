package zachsprojects.tetrisjavafx;

/**
 * This is the abstract class for the tetris pieces, it acts as a blue print for all the other pieces.
 */

public abstract class Tetrimino {
    int[][] shape;
    int currentRow = 0;
    int currentCol = 0;
    
    /**
     * default constructor that is going to be different for each piece
     */
    public Tetrimino(){
    }
    
    /**
     * Simple return of the shapes
     * @return returns the 2D array of the shape
     */
    public int[][] getShape(){
        return this.shape;
    };


    public void moveShapeLeft(){
        this.currentCol = this.currentCol - 1;
    }
    public void moveShapeRight(){
        this.currentCol = this.currentCol + 1;

    }
    public void moveShapeDown(){
        this.currentRow = this.currentRow + 1;
    }
    public void moveShapeUp(){
        this.currentRow = this.currentRow - 1;
    }
    
    /**
     * basic getter for the row position
     * @return returns the int current row
     */
    public int getCurrentRow(){
        return currentRow;
    }
    
    /**
     * basic getter for the col position
     * @return
     */
    public int getCurrentCol(){
        return currentCol;
    }

    /**
     * Setter for the row in order to move the pieces around
     * @param currentRow
     */
    public void setCurrentRow(int currentRow){
        this.currentRow = currentRow;
    }
    
    /**
     * Setter for the col in order to move the pieces around
     * @param currentCol
     */
    public void setCurrentCol(int currentCol){
        this.currentCol = currentCol;
    }
}
