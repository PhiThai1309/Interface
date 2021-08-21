package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));

        //Set root node in scene
        Scene scene = new Scene(root);

        //Get style sheet
        scene.getStylesheets().add("css/style.css");

        //Set stage title
        stage.setTitle("News Application");

        //Set stage resize
        stage.setResizable(true);

        //Set application icon
        stage.getIcons().add(new Image("image/book.jpg"));

        //Get scene
        stage.setScene(scene);

        //Set maximized stage
        stage.setMaximized(true);

        //Set stage size
        stage.setMinHeight(700);
        stage.setMinWidth(870);
        //remove the app bar
        //stage.initStyle(StageStyle.UNDECORATED);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
