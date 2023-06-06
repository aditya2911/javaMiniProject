<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/signIn-servlet/" method="GET"> 
<label for="name">Name</label>
<input type="text" name="name" id="name" required>

<label for="ucid">Ucid</label>
<input type="number" name="ucid" id="ucid" required>

<label for="pass">password</label>
<input type="password" name="pass" id="pass" required>

<button type="submit" >Sign In</button>
</form>
</body>
</html>