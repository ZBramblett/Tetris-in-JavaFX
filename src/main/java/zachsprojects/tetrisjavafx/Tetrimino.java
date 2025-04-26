package zachsprojects.tetrisjavafx;

public class Tetrimino {
    double xPos;
    double yPos;
    
    public Tetrimino(Double xPos, Double yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    public void setxPos(double xPos){
        this.xPos = xPos;
    }
    public void setyPos(double yPos){
        this.yPos = yPos;
    }
    
    public double getxPos(){
        return this.xPos;
    }
    public double getyPos(){
        return this.yPos;
    }
}
