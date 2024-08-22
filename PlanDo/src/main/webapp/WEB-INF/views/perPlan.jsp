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
            <th>Actions</th>
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
                <td>
                    <!-- Edit and Delete actions -->
                    <form action="/edit" method="post" style="display:inline;">
                        <input type="hidden" name="planId" value="${perPlan.planId}">
                        <input type="hidden" name="title" value="${perPlan.title}">
                        <input type="hidden" name="description" value="${perPlan.description}">
                        <input type="hidden" name="startDate" value="${perPlan.startDate}">
                        <input type="hidden" name="endDate" value="${perPlan.endDate}">
                        <button type="submit">Edit</button>
                    </form>
                    <form action="/delete" method="post" style="display:inline;">
                        <input type="hidden" name="planId" value="${perPlan.planId}">
                        <button type="submit">Delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        
        <!-- Row for adding a new plan -->
        <tr>
            <form action="/add" method="post">
                <td></td> <!-- Leave ID blank, it will be auto-generated -->
                <td><input type="text" name="title" placeholder="Title" required></td>
                <td><input type="text" name="description" placeholder="Description" required></td>
                <td><input type="date" name="startDate" required></td>
                <td><input type="date" name="endDate" required></td>
                <td>
                    <select name="status" required>
                        <option value="Pending">Pending</option>
                        <option value="Ongoing">Ongoing</option>
                        <option value="Completed">Completed</option>
                    </select>
                </td>
                <td><button type="submit">Add</button></td>
            </form>
        </tr>
    </tbody>
</table>

<br>
<a href="/menu">Back</a>

</body>
</html>
