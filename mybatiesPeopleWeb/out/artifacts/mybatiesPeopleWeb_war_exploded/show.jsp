<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2019/11/26
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
    </tr>
    <c:forEach items="${list}" var="people">
        <tr>
            <td>${people.id}</td>
            <td>${people.name}</td>
            <td>${people.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
