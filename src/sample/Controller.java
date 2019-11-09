package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    protected Button ringButton;
    @FXML
    protected Button quitButton;

    public void ringBell() {
        System.out.println("Sup?");
    }

    public void quitProgram() {
        System.exit(1);
    }
}
