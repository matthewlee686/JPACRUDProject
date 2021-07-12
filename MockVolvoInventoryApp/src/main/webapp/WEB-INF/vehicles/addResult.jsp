<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Result</title>
</head>
<body>

<h2>Volvo Successfully Added!</h2>

<ul>
	<li>ID: ${vehicle.id}</li>
	<li>Model Year: ${vehicle.modelYear}</li>
	<li>Model: ${vehicle.model}</li>
	<li>Trim: ${vehicle.trim}</li>
	<li>Color: ${vehicle.color}</li>
	<li>Drivetrain: ${vehicle.drivetrain}</li>
	<li>Mileage: ${vehicle.mileage}</li>
</ul>
<br>
<form action="/" method="get"><input type="submit" value="Go to Home"></form>

</body>
</html>