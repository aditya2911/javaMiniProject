<%@page import="com.example.javaMiniProjectAditya.model.AuthModel"%>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
List<AuthModel> usersList = (List<AuthModel>) application.getAttribute("authData");
System.out.println("Hello from the other side");
request.setAttribute("users", usersList);
%>

<html>
<head>
    <title>Users</title>
</head>
<body>
    <h1>User List</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                 <th>UCID</th>
                
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.getId()}</td>
                    <td>${user.getName()}</td>
                    <td>${user.getUCID()}</td>
                    
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
