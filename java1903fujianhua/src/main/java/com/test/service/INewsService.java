package com.test.service;

import com.test.pojo.News;

import java.util.List;

public interface INewsService {
    public int addNews(News news);
    public List<News> selectNews();
    public int deleteNews(int newsId);
    public int updateNews(News news);
}
