package zachsprojects.tetrisjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    
    private GameManager gm;
    public GraphicsContext gc;
    
    
    @Override
    public void start(Stage stage) throws IOException {
        
        Pane pane = new Pane();
        Canvas canvas = new Canvas(800,1000);
        pane.getChildren().add(canvas);
        
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        
        gm = new GameManager(canvas, graphicsContext);
        gm.start();
        
        Scene scene = new Scene(pane);
        stage.setTitle("Tetris");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch();
    }
}