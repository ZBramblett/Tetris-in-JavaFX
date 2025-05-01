package zachsprojects.tetrisjavafx;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This is the TetrisBoard class, it is responsible for drawing and defining the ganmeboard as well as drawing shapes and removing shapes from the gameboard.
 */

public class TetrisBoard {
    int[][] gameBoard;
    
    public TetrisBoard(Integer row, Integer column){
        gameBoard = new int[row][column];
    }
    
    /**
     * Getter for the gameBoard, currently unused but I assume I will need it.
     * @return returns the 2D array of the gamebaord.
     */
    public int[][] getGameBoard(){
        return this.gameBoard;
    }
    
    /**
     * Draw shape method loops through the 2D array of a given shape and then sets the gameboard 2D array to it in order to draw the correct shapes.
     * @param shape takes in a tetrimino piece so it can draw the correct shape.
     */
    public void drawShape(Tetrimino shape){
        for (int row = 0; row < shape.getShape().length; row++){
            for (int col = 0; col < shape.getShape()[row].length; col++){
                if (shape.getShape()[row][col] != 0){
                    gameBoard[row + shape.getCurrentRow()][col + shape.getCurrentCol()] = shape.getShape()[row][col];
                }
            }
        }
    }
    
    /**
     * removeShape will loop through a shapes array and then change that spot to 0's in order for the game board to know to not draw a shape in that spot anymore. I need this so that I'm moving the shapes and not just painting the board 1 color.
     * @param shape takes in a tetrimino as an argument in order to know what the shape looks like
     */
    public void removeShape(Tetrimino shape){
        for (int row = 0; row < shape.getShape().length; row++) {
            for (int col = 0; col < shape.getShape()[row].length; col++) {
                if (shape.getShape()[row][col] != 0) {
                    int boardRow = shape.getCurrentRow() + row;
                    int boardCol = shape.getCurrentCol() + col;
                    gameBoard[boardRow][boardCol] = 0;
                }
            }
        }
    }
    
    /**
     * drawBoard loops through the 2D array and will check to see if there is a 0 or a 1 and then draw the correct color.
     * @param gc this takes in a graphics context object
     * @param cellSize this just lets me adjust how many pixels each cell is.
     */
    public void drawBoard(GraphicsContext gc, int cellSize) {
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[row].length; col++) {
                int cell = gameBoard[row][col];
                
                if (cell != 0) {
                    gc.setFill(Color.CYAN);
                    gc.fillRect(col * cellSize, row * cellSize, cellSize, cellSize);
                } else {
                    gc.setStroke(Color.BLACK);
                    gc.strokeRect(col * cellSize, row * cellSize, cellSize, cellSize);
                }
            }
        }
    }
}
