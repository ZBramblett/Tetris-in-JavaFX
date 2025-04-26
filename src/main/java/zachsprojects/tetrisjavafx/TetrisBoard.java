package zachsprojects.tetrisjavafx;

public class TetrisBoard {
    int[][] gameBoard;
    
    public TetrisBoard(Integer row, Integer column){
        gameBoard = new int[row][column];
    }
    
    public int[][] getGameBoard(){
        return this.gameBoard;
    }
    
    
}
