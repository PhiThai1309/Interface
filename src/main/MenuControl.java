package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuControl {

    private Stage stage;
    private Scene scene;
    private Parent parent;

    @FXML private Button backbutton;

    public void menuHome1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home1.fxml"));

        Stage window = (Stage) backbutton.getScene().getWindow();
        window.setMaximized(true);
        window.setScene(new Scene(root, 800, 800));
    }





}
