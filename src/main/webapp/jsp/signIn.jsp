<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/test-servlet/" method="ACTION"> 
<label for="name"></label>
<input type="text" name="name" id="name" required>

<label for="pass"></label>
<input type="password" name="pass" id="pass" required>

<button type="submit" >Sign In</button>
</form>
</body>
</html>