<%@ page import="models.TableModel" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Markus Brødsjø
  Date: 21.10.2020
  Time: 14.14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Klubben får ikke: ${table}<br/>
<br/>

<c:set var="i" value="1"/>
<c:forEach items="${table}" var="table">
<tr>
    <td>${i}</td>
    <td>${table}</td>
</tr>
    <c:set var="i" value="${i+1}"/>
</c:forEach>




<jsp:scriptlet>
String[] windows = new String[]{"Windows XP", "Windows 7", "Windows 8", "Windows mobile"};
pageContext.setAttribute("windows", windows);
</jsp:scriptlet>

<%-- JSTL foreach tag example to loop an array in jsp --%>
<c:forEach var="window" items="${pageScope.windows}">
    <c:out value="${window}"/>
</c:forEach>

</html>
