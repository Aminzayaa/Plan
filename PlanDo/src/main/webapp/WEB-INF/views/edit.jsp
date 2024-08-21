<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Information</title>
</head>
<body>
  <p>
    Please enter the ID to update<br> <span class="required"></span> is required
  </p>

  <c:if test="${not empty errMsg}">
    <p class="error">${fn:escapeXml(errMsg)}</p>
  </c:if>

  <form action="edit" method="post">
    <fieldset>
      <div>
        <label class="required">ID</label>
        <input type="text" name="planId" value="${fn:escapeXml(perPlan.planId)}" />
        <c:if test="${not empty errors['planId']}">
          <span class="error">${fn:escapeXml(errors['planId'])}</span>
        </c:if>
      </div>
    </fieldset>
    <button type="submit">Confirm</button>
  </form>

  <div>
    <a href="menu">Menu</a>
  </div>
</body>
</html>
