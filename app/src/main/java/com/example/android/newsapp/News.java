package com.example.android.newsapp;


public class News {

    private String mTitle;
    private String mDate;
    private String mUrl;
    private String mSection;
    private String mAuthor;

    public News(String title, String date, String url, String section ,String author) {
        this.mTitle = title;
        this.mDate = date;
        this.mUrl = url;
        this.mSection = section;
        this.mAuthor = author;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDate() {
        return mDate;
    }


    public String getUrl() {
        return mUrl;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getSection() {
        return mSection;
    }

    @Override
    public String toString() {
        return " title " + getTitle();

    }
}
