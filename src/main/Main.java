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
        Parent root = FXMLLoader.load(getClass().getResource("homescreen.fxml"));

        Scene scene = new Scene(root);

        scene.getStylesheets().add("C:\\Users\\phima\\IdeaProjects\\JavaFX\\src\\css\\style.css");
        stage.setTitle("News Application");
        stage.setResizable(true);
        stage.getIcons().add(new Image("image/book.jpg"));
        stage.setScene(scene);
        //remove the app bar
        //stage.initStyle(StageStyle.UNDECORATED);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
