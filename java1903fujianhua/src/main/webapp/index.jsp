<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<style type="text/css">
    #newsAdd_top{
        height:30px;
        font-family:"楷体";
        font-size:16px;
        border-bottom: 1px solid #D4D5D7;
    }
    #newsAdd_mid{
        height:400px;
        margin-top:5px;
    }
    #newsAdd_form{
        position: absolute;
        top: 15%;
        left:30%;
    }
    .inaddp{
        padding-left: 17px;
        width: 180px;
        height: 35px;
        border: 1px solid skyblue;
        border-radius: 8px;

    }
    .con{
        padding-left: 10px;
        width: 250px;
        height: 130px;
        border: 1px solid skyblue;
        border-radius: 8px;
        font-family:"黑体";
        font-size: small;
    }
</style>
</head>
<body>
<div id = "newsAdd_mid">
    <div id = "newsAdd_form">
        <div id = "newsAdd_top">发布新闻</div>
        <form action = "http://localhost:8080/java1903fujianhua/news/addNews" method="post">
            <span>标题：</span><input class = "inaddp" type = "text"  name = "title"><br><br>
            <span>作者：</span><input class = "inaddp" type = "text"  name = "author"><br><br>
            <span>来源：</span><input class = "inaddp" type = "text"  name = "source"><br><br>
           <%-- <span>内容：</span><input class = "content" type ="text"   name = "newsContent"><br><br>--%>
            <span>内容：</span><textarea name="content" class="con"></textarea><br><br>
            <span class="err">${error}</span><br>
            <input class = "button" type = "submit" value ="提交">
        </form>
         <form method="post" action="http://localhost:8080/java1903fujianhua/news/selectNews">
         <input class = "button" type = "submit" value ="查看">
         </form>
    </div>
</div>
</body>
</html>
