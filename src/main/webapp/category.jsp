<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 9/27/2024
  Time: 3:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Danh sach danh muc</h1>
    <a href="/category?action=add">Them moi</a>
    <table border="1px" width="500px">
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Status</td>
        </tr>
       <c:forEach items="${categories}" var="category">
           <tr>
               <td>${category.categoryId}</td>
               <td>${category.categoryName}</td>
               <td>${category.categoryStatus ? 'Active':'InActive'}</td>
           </tr>
       </c:forEach>

    </table>
</body>
</html>
