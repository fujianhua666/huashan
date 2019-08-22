<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/16
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <style type="text/css">
        #news_top{
            height:30px;
            font-family:"楷体";
            font-size:16px;
            border-bottom: 1px solid #D4D5D7;
        }
        #news_mid{
            height:400px;
            margin-top:5px;
        }
        #news_bottom{
            background-color:#D4D5D7;
            margin:5px auto;
            width:240px;
            height:20px;
            line-height:20px;
            text-align:center;
        }
        td,th{
            width:100px;
            height:30px;
            border: 1px solid #D3D3D3;
            text-align: center;
            font-size: 18px;
        }

    </style>
</head>
<body>
<div id="news_mid">
    <div id="news_top">新闻详情</div>
    <table>
        <tr>
            <th>id</th>
            <th>title</th>
            <th>author</th>
            <th>source</th>
            <th>date</th>
            <th>update</th>
            <th>delete</th>
        </tr>
        <c:forEach items="${newsList}" var ="news">
            <tr>
                <td>${news.newsId}</td>
                <td>${news.title}</td>
                <td>${news.author}</td>
                <td>${news.source}</td>
                <td>${news.time}</td>
                <td><a href="http://localhost:8080/java1903fujianhua/news/selectUpdateNews?newsId=${news.newsId}">update</a></td>
                <td><a href="http://localhost:8080/java1903fujianhua/news/deleteNews?newsId=${news.newsId}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
