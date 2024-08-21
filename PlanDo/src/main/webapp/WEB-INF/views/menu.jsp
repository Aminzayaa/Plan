<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
   
    <title>Menu</title>
</head>
<body>
    <h3>Menu</h3>
    
    <ul>

        <li><a href="account">Profile</a></li>
        <li><a href="workPlan">Work Plan</a></li>
        <li><a href="perPlan">Personal Plan</a></li>
    </ul>
    
     	<form action="${pageContext.request.contextPath}/logout" method="post">
        <button type="submit">Logout</button>
   		</form>
</body>
</html>