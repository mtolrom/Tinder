package com.ngambaye.tinder;

public class Article {
    public String title;
    public String likesNumber;
    public String picUrl;
    public String category;

    public String getPicUrl() {
        return picUrl;
    }
    public String getLikesNumber() {
        return likesNumber;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setLikesNumber(String likesNumber) {
        this.likesNumber = likesNumber;
    }
    public void setCagory(String category) {
        this.category = category;
    }
}
