package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import model.News;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private GridPane newsGrid;
    private List<News> news;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        news = new ArrayList<>(getNews());
        int column = 0;
        int row = 1;
        try {
            for(News news: news) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("block.fxml"));

                Pane pane = fxmlLoader.load();
                NewsController newscontroller = fxmlLoader.getController();
                newscontroller.setData(news);

                if(column == 3){
                    column = 0;
                    ++row;
                }
                newsGrid.add(pane,column++, row);
                GridPane.setMargin(pane, new Insets(20));
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private List<News> getNews(){
        List<News> ls = new ArrayList<>();

//        News news = new News();
//        news.setHeader("This is a News header");
//        news.setTime(123);
//        news.setImgSrc("C:\\Users\\phima\\IdeaProjects\\JavaFX\\src\\image\\breaking-news-1576197867.jpg");
//        news.setSource("RMIT News");
//        ls.add(news);
//
//        news = new News();
//        news.setHeader("This is a News header");
//        news.setTime(123);
//        news.setImgSrc("C:\\Users\\phima\\IdeaProjects\\JavaFX\\src\\image\\breaking-news-1576197867.jpg");
//        news.setSource("RMIT News");
//        ls.add(news);
//
//        news = new News();
//        news.setHeader("This is a News header");
//        news.setTime(123);
//        news.setImgSrc("C:\\Users\\phima\\IdeaProjects\\JavaFX\\src\\image\\breaking-news-1576197867.jpg");
//        news.setSource("RMIT News");
//        ls.add(news);

        return ls;
    }
}
