package com.rumofuture.nemo.model.entity;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class Page extends NemoEntity {

    private Book book;  // 所属漫画册
    private String imageUrl;  // 图像

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
