package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuControl {

    private Stage stage;
    private Scene scene;
    private Parent parent;

    public void menuCategories(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void menuHome1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void menuHome2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void menuHome3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void menuHome4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home4.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void menuHome5(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home5.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void menuCovid(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Covid.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void article(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NewsTemplate.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



}
