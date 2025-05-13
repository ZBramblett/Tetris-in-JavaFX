module zachsprojects.tetrisjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens zachsprojects.tetrisjavafx to javafx.fxml;
    exports zachsprojects.tetrisjavafx;
}