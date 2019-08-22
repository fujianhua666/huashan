package com.test.mapper;

import com.test.pojo.News;

import java.util.List;

public interface NewsMapper {
    public int addNews(News news);
    public List<News> selectNews();
    public int deleteNews(int newsId);
    public int updateNews(News news);
}
