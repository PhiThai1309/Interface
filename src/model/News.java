package model;

public class News {
    private String header;
    private int time;
    private String source;
    private String imgSrc;

    public String getImgSrc() { return imgSrc; }

    public void setImgSrc(String imgSrc) { this.imgSrc = imgSrc; }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
