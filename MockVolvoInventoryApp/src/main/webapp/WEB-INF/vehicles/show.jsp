<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vehicles List</title>
</head>
<body>

<h2>Vehicle Inventory Results:</h2>
<c:choose>
	<c:when test="${!empty vehicles}">
		<c:forEach var="vehicle" items="${vehicles}">
			<ul>
 				<li>
 				<b><a href="VehicleInfo.do?id=${vehicle.id}">
 				${vehicle.modelYear} ${vehicle.model}</a></b>
 				</li>
			</ul> 
		</c:forEach>
	</c:when>
	<c:otherwise>
		<p>No Vehicles are available in your Area</p>
	</c:otherwise>
</c:choose>
<p>${vehicles.size()} Results Found</p>

<br>
<form action="/" method="get"><input type="submit" value="Go to Home"></form>

</body>
</html>