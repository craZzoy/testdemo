<%--
  Created by IntelliJ IDEA.
  User: zwz
  Date: 2019/5/15
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="resources/style.css">"/>
</head>
<body>
    <h1>Welcome to Spittr</h1>
    <a href="<c:url value="/spittles"/>">spittles</a>
    <a href="<c:url value="/spitter/register"/>">register</a>
</body>
</html>