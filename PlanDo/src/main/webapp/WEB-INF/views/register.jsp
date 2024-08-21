<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Profile</title>
        </head>

        <body>
            <p> Create a new user </p>
            <form:form action="user" method="post" modelAttribute="userForm">
                <label>LoginId:</label></label>
                <form:input path="login_id" />
                </br>
                <label>Name:</label>
                <form:input path="name" />
                </br>
                <label>Password:</label>
                <form:input path="password" />
                </br>
               <label>Email:</label>
                <form:input path="email" />
                </br>
                <label>Phone Number:</label>
                <form:input path="phone_number" />
                </br>
                </div>
                </br>
                <form:button> Register</form:button>
                </br>
            
             <form action="${pageContext.request.contextPath}/menu" method="get">
        <button type="submit">return</button>
    </form>
    </form:form>
            <p>${errMsg}</p>
        </body>

        </html> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Register</title>
</head>

<body>
    <p>Create a new user</p>
    
    <!-- Registration form -->
    <form:form action="user" method="post" modelAttribute="userForm">
        <label>LoginId:</label>
        <form:input path="login_id" />
        <br>
        
        <label>Name:</label>
        <form:input path="name" />
        <br>
        
        <label>Password:</label>
        <form:input path="password" />
        <br>
        
        <label>Email:</label>
        <form:input path="email" />
        <br>
        
        <label>Phone Number:</label>
        <form:input path="phone_number" />
        <br>
        
        <br>
        <!-- Register button -->
        <form:button>Register</form:button>
        <br>
    </form:form>

    <!-- Return button -->
    <form action="${pageContext.request.contextPath}/menu" method="get">
        <button type="submit">Return to menu</button>
    </form>

    <!-- Display error message if any -->
    <p>${errMsg}</p>
    
</body>

</html>
        