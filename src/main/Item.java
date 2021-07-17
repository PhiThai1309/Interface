package main;

public class Item {
    private String title;
    private String link;
    private String pubDate;
    private String imgSrc;

    public Item(String title, String link, String pubDate, String imgSrc) {
        this.title = title;
        this.link = link;
        this.pubDate = pubDate;
        this.imgSrc = imgSrc;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getImgSrc() {
        return imgSrc;
    }
}