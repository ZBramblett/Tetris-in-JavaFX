package zachsprojects.tetrisjavafx;

import javafx.scene.paint.Color;

public class ColorPicker {
    public Color pickColor( int cell ){

        switch (cell){
            case 1:
                return Color.CYAN;
            case 2:
                return Color.BLUE;

            case 3:
                return Color.ORANGE;
            case 4:
                return Color.YELLOW;
            case 5:
                return Color.GREEN;
            case 6:
                return Color.PURPLE;
            case 7:
                return Color.RED;
            default:
                return null;
        }
    }
}
