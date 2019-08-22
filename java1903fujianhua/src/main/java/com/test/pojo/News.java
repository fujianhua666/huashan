package com.test.pojo;

import java.util.Date;

public class News {
    private int newsid;
    private String title;
    private String author;
    private String source;
    private String content;
    private Date time;

    public int getNewsId() {
        return newsid;
    }

    public void setNewsId(int newsId) {
        this.newsid = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsid +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", source='" + source + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }
}
