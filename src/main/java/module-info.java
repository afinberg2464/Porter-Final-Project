module Porter.Final.Project {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.andrewfinberg to javafx.fxml;
    exports com.andrewfinberg;
}