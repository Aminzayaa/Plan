<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Login</title>
</head>

<body>
    <h1> Welcome to Plan Do </h1>
    
    <h2> User Login  </h2>
    
    <form:form action="login" method="post" modelAttribute="loginForm">
        <label>Login Id:</label>
        <form:input path="login_id"/>
        <br/>
        <label>Password:</label>
        <form:input path="password"/>
        <br/>
        <form:button> Login</form:button>
        <br/><br/>
    </form:form>

    <!-- Separate form for Register button -->
    <form action="${pageContext.request.contextPath}/register" method="get">
        <button type="submit">Don't have an account? Register now!</button>
    </form>
    
    <p>${errMsg}</p>
</body>

</html>