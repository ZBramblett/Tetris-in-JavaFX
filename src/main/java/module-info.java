module zachsprojects.tetrisjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    
    
    opens zachsprojects.tetrisjavafx to javafx.fxml;
    exports zachsprojects.tetrisjavafx;
}