package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("interface.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("News Application");
        stage.setResizable(true);
//        stage.getIcons().add(new Image("C:\\Users\\phima\\IdeaProjects\\JavaFX\\src\\sample\\book.jpg"));
        stage.setScene(scene);
        //remove the app bar
        //stage.initStyle(StageStyle.UNDECORATED);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
