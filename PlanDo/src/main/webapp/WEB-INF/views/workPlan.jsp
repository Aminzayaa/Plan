<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Work Plan</title>
</head>
<body>

<h1>Work Plan</h1>

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
        <c:forEach items="${workPlanList}" var="workPlan">
            <tr>
                <td>${fn:escapeXml(workPlan.planId)}</td> 
                <td>${fn:escapeXml(workPlan.title)}</td>
                <td>${fn:escapeXml(workPlan.description)}</td>
                <td>${fn:escapeXml(workPlan.startDate)}</td> 
                <td>${fn:escapeXml(workPlan.endDate)}</td>
                <td>${fn:escapeXml(workPlan.status)}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<br>

<!-- Form for Add, Edit, Delete -->
<form action="/action" method="post">
    <input type="hidden" name="planId" value="${planId}" />
    <button type="submit" name="add" value="add">Add</button>
    <button type="submit" name="edit" value="edit">Edit</button>
    <button type="submit" name="delete" value="delete">Delete</button>
</form>

<!-- <form action="/edit" method="post">
    <button type="submit" >edit</button>
</form>
<form action="/delete" method="post">
    <button type="submit" >delete</button>
</form>
<form action="/add" method="post">
    <button type="submit" >add</button>
</form> -->

<br>
<a href="/menu">Back</a>
<br>

</body>
</html>
