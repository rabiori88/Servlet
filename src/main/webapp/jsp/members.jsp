<%--
  Created by IntelliJ IDEA.
  User: rabiori
  Date: 11/8/23
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="hello.servelet.domain.member.MemberRepository" %>
<%@ page import="hello.servelet.domain.member.Member" %>
<%@ page import="java.util.List" %>

<%
  MemberRepository memberRepository = MemberRepository.getInstance();
  List<Member> members = memberRepository.findAll();
%>
<%@ page contentType="text/html;charset=UTF-8" %>
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

  <tbody> <%
    for (Member member : members) {
      out.write("<tr>");
      out.write(" <td>" + member.getId() + "</td>");
      out.write(" <td>" + member.getUsername() + "</td>");
      out.write(" <td>" + member.getAge() + "</td>");
      out.write("</tr>");
    } %>
  </tbody>
</table>
</body>
</html>
