<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Personal Plan</title>
</head>
<body>

<h1>Personal Plan</h1>

<table border="1">
    
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Description</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Status</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${perPlanList}" var="perPlan">
            <tr>
                <td>${fn:escapeXml(perPlan.planId)}</td> 
                <td>${fn:escapeXml(perPlan.title)}</td>
                <td>${fn:escapeXml(perPlan.description)}</td>
                <td>${fn:escapeXml(perPlan.startDate)}</td> 
                <td>${fn:escapeXml(perPlan.endDate)}</td>
                <td>${fn:escapeXml(perPlan.status)}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<br>

<!-- Form for Add, Edit, Delete -->
<!-- <form action="/plans/action" method="post">
    <input type="hidden" name="planId" value="${planId}" />
    <button type="submit" name="action" value="add">Add</button>
    <button type="submit" name="action" value="edit">Edit</button>
    <button type="submit" name="action" value="delete">Delete</button>
</form> -->

<form action="/edit" method="post">
    <button type="submit" >edit</button>
</form>
<form action="/add" method="post">
    <button type="submit" >add</button>
</form>
<form action="/delete" method="post">
    <button type="submit" >delete</button>
</form>

<br>
<a href="/menu">Back</a>
<br>

</body>
</html>
