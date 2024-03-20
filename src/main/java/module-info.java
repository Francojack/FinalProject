module org.trabalho {
    requires javafx.controls;
    requires java.sql;
    requires javafx.fxml;
    requires javafx.media;
    opens org.trabalho.exemplo to javafx.fxml;
    exports org.trabalho.exemplo;
}