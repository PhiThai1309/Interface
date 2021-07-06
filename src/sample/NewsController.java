package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.News;

import java.util.Objects;

public class NewsController {
    @FXML
    private ImageView img;

    @FXML
    private Label source;

    @FXML
    private Label time;

    @FXML
    private Label header;

    public void setData(News news){
        Image image = new Image(getClass().getResourceAsStream(news.getImgSrc()));
        img.setImage(image);
        header.setText(news.getHeader());
        source.setText(news.getSource());
        time.setText(news.getTime() + "ago");


    }
}
