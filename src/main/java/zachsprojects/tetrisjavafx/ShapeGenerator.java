package zachsprojects.tetrisjavafx;

import java.util.Random;

public class ShapeGenerator {

    public Tetrimino pickRandomShape(){
        Random random = new Random();
        int randomShape = random.nextInt(1,8);
        switch (randomShape){
            case 1:
                return new I();
            case 2:
                return new J();
            case 3:
                return new L();
            case 4:
                return new S();
            case 5:
                return new Z();
            case 6:
                return new O();
            case 7:
                return new T();
            default:
                return null;
        }
}}
