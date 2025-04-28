package zachsprojects.tetrisjavafx;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class TetrisBoard {
    int[][] gameBoard;
    
    public TetrisBoard(Integer row, Integer column){
        gameBoard = new int[row][column];
    }
    
    public int[][] getGameBoard(){
        return this.gameBoard;
    }
    
    public void drawShape(Tetrimino shape){
        for (int row = 0; row < shape.getShape().length; row++){
            for (int col = 0; col < shape.getShape()[row].length; col++){
                if (shape.getShape()[row][col] != 0){
                    gameBoard[row + shape.getCurrentRow()][col + shape.getCurrentCol()] = shape.getShape()[row][col];
                }
            }
        }
    }
    
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
