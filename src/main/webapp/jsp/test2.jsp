<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="/test-servlet/">
    <label for="name">Name: </label>
    <input type="text" id="name" name="name" required>
    
    <label for="ucid">UCID:</label>
    <input type="number" id="ucid" name="ucid" required>
    
    <button type="submit">Submit</button>
</form>

<form method="GET" action="/test-servlet/">
    <button type="pust">Submit</button>
</form>

</body>
</html>