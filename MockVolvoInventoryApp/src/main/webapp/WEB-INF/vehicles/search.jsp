<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search for a Volvo</title>
</head>
<body>
<h2>Search Form:</h2>

<form action="SearchResults.do">
  <label for="vehicle search">Criteria: </label><br>
  <select name="model">
    <option value="">  Model  </option>
    <option value="XC90">XC90</option>
    <option value="XC60">XC60</option>
    <option value="XC70">XC70</option>
    <option value="S90">S90</option>
    <option value="S60">S60</option>
    <option value="V90">V90</option>
  </select>
  <select name="trim">
    <option value="">  Trim  </option>
    <option value="Momentum">Momentum</option>
    <option value="R-Design">R-Design</option>
    <option value="Inscription">Inscription</option>
  </select>
  <select name="color">
    <option value="">  Color  </option>
    <option value="Red">Red</option>
    <option value="White">White</option>
    <option value="Gray">Gray</option>
    <option value="Blue">Blue</option>
    <option value="Silver">Silver</option>
    <option value="Black">Black</option>
  </select>
  <select name="drivetrain">
    <option value="">  Drivetrain  </option>
    <option value="AWD">All-Wheel Drive</option>
    <option value="FWD">Front-Wheel Drive</option>
  </select>
  <br>
  Model Year: <input type="text" name="modelYear">
  
  <br>
  <input type="submit" value="Submit"/>
 </form>

</body>
</html>