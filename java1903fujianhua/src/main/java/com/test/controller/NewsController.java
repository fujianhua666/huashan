package com.test.controller;

import com.test.pojo.News;
import com.test.service.INewsService;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private INewsService newsService;
    @RequestMapping("/addNews")
    public ModelAndView addNews(String title,String author,String source,String content){
        News news = new News();
        news.setTitle(title);
        news.setAuthor(author);
        news.setSource(source);
        news.setContent(content);
        ModelAndView modelAndView = new ModelAndView();
        int result=newsService.addNews(news);
        if(result!=0){
            modelAndView.addObject("error","添加成功");
        }
        else{
            modelAndView.addObject("error","添加失败");
        }
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @RequestMapping("/selectNews")
    public ModelAndView selectNews(){
        List<News> newsList = newsService.selectNews();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("newsList",newsList);
        modelAndView.setViewName("newsView");
        return modelAndView;
    }
    @RequestMapping("deleteNews")
    public ModelAndView  deleteNews(int newsId){
        int result = newsService.deleteNews(newsId);
        List<News> newsList = newsService.selectNews();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("newsList",newsList);
        modelAndView.setViewName("newsView");
        return modelAndView;
    }
    @RequestMapping("selectUpdateNews")
    public ModelAndView selectUpdateNews(int newsId){
        List<News> newsList = newsService.selectNews();
        News news = new News();
        for (News n:newsList){
            if(n.getNewsId()==newsId){
                news=n;
            }
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("news",news);
        modelAndView.setViewName("newsUpdate");
        return modelAndView;
    }
    @RequestMapping("updateNews")
    public ModelAndView  updateNews(int newsId,String title,String author,String source,String content){
        News news = new News();
        news.setNewsId(newsId);
        news.setTitle(title);
        news.setAuthor(author);
        news.setSource(source);
        news.setContent(content);
        System.out.println("进入更新");
        System.out.println(news);
        int result = newsService.updateNews(news);
        ModelAndView modelAndView = new ModelAndView();
        if(result!=0){
            modelAndView.addObject("error","修改成功");
        }
        else {
            modelAndView.addObject("error","修改失败");
        }
        modelAndView.setViewName("newsUpdate");
        return modelAndView;
    }
}
