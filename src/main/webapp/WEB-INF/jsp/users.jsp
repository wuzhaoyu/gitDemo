<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD//XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <title></title>
</head>
<body>
<table border="1" width="50%">
    <tr>
        <th>ID</th>
        <th>NAME</th>
    </tr>
    <c:forEach items="${requestScope.users}" var="user" >
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>