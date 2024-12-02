package com.example.nasaimagesearch;
import java.net.URL;

public class NASAItem {

    private long id;
    private String date;
    private String title;
    private String explanation;
    private URL imageURL;

    public NASAItem(String date, String title, String explanation, URL imageURL) {
        this.date = date;
        this.title = title;
        this.explanation = explanation;
        this.imageURL = imageURL;
    }
    public NASAItem(Long id, String date, String title, String explanation, URL imageURL) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.explanation = explanation;
        this.imageURL = imageURL;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExplanation() {
        return this.explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public URL getImageURL() {
        return this.imageURL;
    }

    public void setImageURL(URL imageURL) {
        this.imageURL = imageURL;
    }

}
