<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
    <h1>User List</h1>
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>UCID</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.name}</td>
                    <td>${user.ucid}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
