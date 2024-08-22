
<<<<<<< HEAD
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
        <!DOCTYPE html>
        <html>
>>>>>>> 406cf891ccfa8792b0a7612a3c8d8d84d11180df

<head>
    <meta charset="UTF-8">
    <title>User Login</title>
</head>

<<<<<<< HEAD
<body>
    <p> Welcome to Plan Do </p>
    
    <p> User Login  </p>
    
    <form:form action="login" method="post" modelAttribute="loginForm">
        <label>Login Id:</label>
        <form:input path="login_id"/>
        <br/>
        <label>Password:</label>
        <form:input path="password"/>
        <br/>
        <form:button> Login</form:button>
        <br/>
    </form:form>
=======
        <body>
            <h1> Welcome to Plan Do </h1>
            
            <h2> User Login  </h2>
            <form:form action="login" method="post" modelAttribute="loginForm">
                <label>Login Id:</label></label>
                <form:input path="login_id" />
                </br>
                <label>Password:</label>
                <form:input path="password" />
                </br>
                <form:button> Login</form:button>
                </br>
                </br>
                <!-- <form:button> Don't have account? Register now! </form:button>
                </br> -->
               
                
            </form:form>
            <p>${errMsg}</p>
        </body>
>>>>>>> 406cf891ccfa8792b0a7612a3c8d8d84d11180df

    <!-- Separate form for Register button -->
    <form action="${pageContext.request.contextPath}/register" method="get">
        <button type="submit">Don't have an account? Register now!</button>
    </form>
    
    <p>${errMsg}</p>
</body>

</html>
        