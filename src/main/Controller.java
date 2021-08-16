package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private GridPane newsGrid;
    @FXML private FlowPane flowPane;

    @FXML private Label header;
    @FXML private Label header1;
    @FXML private Label header2;
    @FXML private Label header3;
    @FXML private Label header4;
    @FXML private Label header5;
    @FXML private Label header6;
    @FXML private Label header7;
    @FXML private Label header8;
    @FXML private Label header9;

    @FXML private ImageView image;
    @FXML private ImageView image1;
    @FXML private ImageView image2;
    @FXML private ImageView image3;
    @FXML private ImageView image4;
    @FXML private ImageView image5;
    @FXML private ImageView image6;
    @FXML private ImageView image7;
    @FXML private ImageView image8;
    @FXML private ImageView image9;

    @FXML private Button button;
    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;
    @FXML private Button button5;
    @FXML private Button button6;
    @FXML private Button button7;
    @FXML private Button button8;
    @FXML private Button button9;

    @FXML private Button page1;
    @FXML private Button page2;
    @FXML private Button page3;
    @FXML private Button page4;
    @FXML private Button page5;

    private ArrayList<ImageView> images = new ArrayList<>();
    private ArrayList<Label> labels = new ArrayList<>();
    private ArrayList<Button> buttons = new ArrayList<>();
    private ArrayList<Button> pages = new ArrayList<>();
    private ArrayList<Item> items;
    private final int itemsPerPage = 10;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        items = readRSS("https://vnexpress.net/rss/tin-moi-nhat.rss");
        addNodeToList();
        changePage(0);

        for (int i = 0; i < pages.size(); i++){
            int idx = i;

            pages.get(i).setOnAction(e -> {
                changePage(idx);
            });
        }
    }

    public static ArrayList<Item> readRSS(String urlAddress) {
        try{
            URL rssURL = new URL(urlAddress);
            BufferedReader in = new BufferedReader(new InputStreamReader(rssURL.openStream()));
            String title = "", pubDate = "", link = "", imgSrc = "",line;
            ArrayList<Item> items = new ArrayList<Item>();
            boolean inItem = false;

            while ((line = in.readLine()) != null){
                if (line.contains("<item>")){
                    inItem = true;
                }else if (line.contains("<title>") && inItem){
                    title = extract(line, "<title>", "</title>");
                }else if (line.contains("<pubDate>") && inItem){
                    pubDate = extract(line, "<pubDate>", "</pubDate>");
                }else if (line.contains("<link>") && inItem){
                    link = extract(line, "<link>", "</link>");
                }else if (line.contains("<description>") && inItem){
                    try{
                        imgSrc = extract(line, "<description>", "</description>");
                        imgSrc = extract(imgSrc, "<img src=\"", "\"");
                    }catch (StringIndexOutOfBoundsException e){
                        imgSrc = "";
                    }
                }
                else if (line.contains("</item>") && inItem){
                    inItem = false;
                    Item item = new Item(title, link, pubDate, imgSrc);
                    items.add(item);
                }
            }

            in.close();
            return items;
        }
        catch (MalformedURLException e){
            e.printStackTrace();
            return null;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String extract(String line, String start, String end){
        int firstPos = line.indexOf(start);
        String temp = line.substring(firstPos);
        temp = temp.replace(start, "");
        int lastPos = temp.indexOf(end);
        temp = temp.substring(0, lastPos);
        return temp;
    }

    private void addNodeToList(){
        for (Label l : Arrays.asList(header, header1, header2, header3, header4, header5, header6, header7, header8, header9)) {
            labels.add(l);
        }

        for (Button b : Arrays.asList(button, button1, button2, button3, button4, button5, button6, button7, button8, button9)) {
            buttons.add(b);
        }

        for (Button b : Arrays.asList(page1, page2, page3, page4, page5)) {
            pages.add(b);
        }

        for (ImageView i : Arrays.asList(image, image1, image2, image3, image4, image5, image6, image7, image8, image9)){
            images.add(i);
        }
    }

    private void changePage(int page){
        for (int i = 0; i < itemsPerPage; i++){
            int idx = i + (page * itemsPerPage);

            labels.get(i).setText(items.get(idx).getTitle());

            buttons.get(i).setOnAction(e -> {
                System.out.println(items.get(idx).getLink());
            });

            if (!items.get(idx).getImgSrc().equals("")){
                images.get(i).setImage(new Image(items.get(idx).getImgSrc()));
            }
        }
    }

    @FXML private Button menu;

    public void changeRoot(ActionEvent event) throws  IOException {
        try {
            Parent root2 = FXMLLoader.load(getClass().getResource("Categories.fxml"));

            menu.getScene().setRoot(root2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
