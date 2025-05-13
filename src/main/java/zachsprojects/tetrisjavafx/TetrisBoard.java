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
    public void drawShapeToBoard(Tetrimino shape){
        int[][] shapeMatrix = shape.getShape();
        int offsetRow = shape.getCurrentRow();
        int offsetCol = shape.getCurrentCol();

        for (int row = 0; row < shapeMatrix.length; row++){
            for (int col = 0; col < shapeMatrix[row].length; col++){
                int isShapeHere = shapeMatrix[row][col];
                if (isShapeHere != 0){
                    gameBoard[row + offsetRow][col + offsetCol] = isShapeHere;
                }
            }
        }
    }

    /**
     * removeShape will loop through a shapes array and then change that spot to 0's in order for the game board to know to not draw a shape in that spot anymore. I need this so that I'm moving the shapes and not just painting the board 1 color.
     * @param shape takes in a tetrimino as an argument in order to know what the shape looks like
     */
    public void removeShapeFromBoard(Tetrimino shape){
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

    public void drawTetrimino(GraphicsContext gc, Tetrimino shape, int cellSize) {
        int[][] shapeMatrix = shape.getShape();
        int startingRow = shape.getCurrentRow();
        int startingCol = shape.getCurrentCol();

        for (int row = 0; row < shapeMatrix.length; row++) {
            for (int col = 0; col < shapeMatrix[row].length; col++) {
                if (shapeMatrix[row][col] != 0) {
                    gc.setFill(Color.CYAN);
                    gc.fillRect((startingCol + col) * cellSize, (startingRow + row) * cellSize, cellSize, cellSize);
                }
            }
        }
    }

    public boolean canMove(Tetrimino shape, int desiredRow, int desiredCol, int[][] gameboard){
        int[][] shapeShape = shape.getShape();
        int destinationRow = shape.getCurrentRow() + desiredRow;
        int destinationCol = shape.getCurrentCol() + desiredCol;

        for (int row = 0; row < shapeShape.length; row++){
            for(int col = 0; col < shapeShape[row].length; col++){
                if (shapeShape[row][col] != 0){
                    int boardRow = destinationRow + row;
                    int boardCol = destinationCol + col;

                    if (boardRow < 0 || boardRow >= gameboard.length ||
                            boardCol < 0 || boardCol >= gameboard[0].length){
                        return false;
                    }
                    if (gameboard[boardRow][boardCol] != 0 ){
                        return false;
                    }
                }


            }
        }
        return true;
    }



}


