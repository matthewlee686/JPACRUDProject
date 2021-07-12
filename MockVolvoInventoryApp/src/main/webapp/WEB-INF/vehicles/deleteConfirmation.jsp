<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Confirmation</title>
</head>
<body>
<c:choose>
	<c:when test="${!empty vehicle} ">
		There was a problem deleting this Volvo
	</c:when>
	<c:otherwise>
		<p>Deletion Successful</p>
	</c:otherwise>
</c:choose>
<br>
<br>
<form action="/" method="get"><input type="submit" value="Go to Home" ></form>
</body>
</html>