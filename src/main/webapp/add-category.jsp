<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 9/27/2024
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/category">
        <input type="text" placeholder="id" name="id"/>
        <br>
        <input type="text" placeholder="categoryName" name="category"/>
        <br>
        <input type="radio" name="categoryStatus" value="1"> Active
        <input type="radio" name="categoryStatus" value="0"> Inactive
        <br>
        <button type="submit">ADD</button>
    </form>
</body>
</html>
