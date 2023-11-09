<%--
  Created by IntelliJ IDEA.
  User: rabiori
  Date: 11/8/23
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<c:url value="/index.html"/>">메인</a>
<table>
  <tr>
    <th>id</th>
    <th>username</th>
    <th>age</th>
  </tr>

  <tbody>
  <c:forEach var="item" items="${members}" >
    <tr>
      <td>${item.id}</td>
      <td>${item.username}</td>
      <td>${item.age}</td>

    </tr>
  </c:forEach>

  </tbody>
</table>
</body>
</html>
