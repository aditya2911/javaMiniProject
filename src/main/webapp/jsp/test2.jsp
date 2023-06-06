<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f5f5f5;
        }
        
        .container {
            max-width: 400px;
            margin: 0 auto;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
        }
        
        h1 {
            text-align: center;
            margin-bottom: 20px;
        }
        
        form {
            margin-bottom: 20px;
        }
        
        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
        }
        
        input[type="text"],
        input[type="number"],
        input[type="password"] {
            padding: 10px;
            width: 100%;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            margin-bottom: 10px;
        }
        
        button[type="submit"] {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Registration Page</h1>
        <form method="POST" action="/test-servlet/">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
            
            <label for="ucid">UCID:</label>
            <input type="number" id="ucid" name="ucid" required>
            
            <label for="pass">Password:</label>
            <input type="password" name="pass" id="pass" required>
            
            <button type="submit">Submit</button>
        </form>
    
        <form method="GET" action="/test-servlet/">
            <button type="submit">List Users</button>
        </form>
        
        
    </div>
            <jsp:include page="/jsp/footer.jsp" />
    
</body>
</html>
