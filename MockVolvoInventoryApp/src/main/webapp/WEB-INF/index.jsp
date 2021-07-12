<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<link href="css/styles.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Volvo Inventory Site</title>
</head>
<body>

<h2>Vehicle Inventory</h2>
<hr>
<br>
<p><b>Directory:</b></p>

<form action="ShowAll.do" method="get">
<input type="submit" value="Show all Inventory">
</form>

<!--Search for Vehicle based on Criteria-->
<form action="Search.do" method="get">
<input type="submit" value="Search for a Volvo">
</form>

<!--Add or Update a Vehicle Vehicle-->
<form action="AddOrUpdate.do" method="get">
<input type="submit" value="Add or Update a Volvo">
</form>



</body>
</html>