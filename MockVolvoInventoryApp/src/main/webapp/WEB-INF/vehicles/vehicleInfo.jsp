<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="css/styles.css" rel="stylesheet" />
<meta charset="UTF-8">
<title>Vehicle Information</title>
</head>
<body>

<img src="${vehicle.pic}" alt="vehicle img" class="vehicle-fit"/>

<ul>
	<li>ID: ${vehicle.id}</li>
	<li>Model Year: ${vehicle.modelYear}</li>
	<li>Model: ${vehicle.model}</li>
	<li>Trim: ${vehicle.trim}</li>
	<li>Color: ${vehicle.color}</li>
	<li>Drivetrain: ${vehicle.drivetrain}</li>
	<li>At Dealership: ${vehicle.dealerId} (will be replaced with Dealership name in future)</li>
	<li>Mileage: ${vehicle.mileage}</li>
</ul>

<br>

<form action="Delete.do?id=${vehicle.id}" method="post">
<input type="Submit" value="Delete this Volvo" onclick="return confirm('Are you sure?')"/>
</form>

<br>
<form action="/" method="get"><input type="submit" value="Go to Home" ></form>
</body>
</html>