<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="hello.servelet.domain.member.Member" %>
<%@ page import="hello.servelet.domain.member.MemberRepository" %><%--
  Created by IntelliJ IDEA.
  User: rabiori
  Date: 11/8/23
  Time: 2:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<%
    MemberRepository memberRepository = MemberRepository.getInstance();

    System.out.println("MemberSaveServlet.service");
    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);
%>

<html>
<head>
    <title>Save</title>
</head>
<body>
<ul>
    <li> id=<%=member.getId()%>  </li>
    <li> username=<%=member.getUsername()%>  </li>
</ul>
<a href="<c:url value="/index.html"/>" target="_blank" > 메인 commit testdd </a>

</body>
</html>
