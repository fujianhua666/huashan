package com.test.service.impl;

import com.test.mapper.NewsMapper;
import com.test.pojo.News;
import com.test.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService implements INewsService {
    @Autowired
    private NewsMapper newsMapper;

    public NewsMapper getNewsMapper() {
        return newsMapper;
    }

    public void setNewsMapper(NewsMapper newsMapper) {
        this.newsMapper = newsMapper;
    }

    @Override
    public int addNews(News news) {
        return newsMapper.addNews(news);
    }

    @Override
    public List<News> selectNews() {
        return newsMapper.selectNews();
    }

    @Override
    public int deleteNews(int newsId) {
        return newsMapper.deleteNews(newsId);
    }

    @Override
    public int updateNews(News news) {
        return newsMapper.updateNews(news);
    }
}
