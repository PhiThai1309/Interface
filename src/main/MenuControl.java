package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuControl {

    //Switching scene from menu back to home page
    @FXML
    private Button backbutton;

    public void changeRoot1(ActionEvent event) throws IOException {
        try {
            Parent root2 = FXMLLoader.load(getClass().getResource("Home.fxml"));
            backbutton.getScene().setRoot(root2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
