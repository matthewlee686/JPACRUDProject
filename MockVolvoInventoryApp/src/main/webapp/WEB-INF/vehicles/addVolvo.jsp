<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Volvo</title>
</head>
<body>

<form action="AddResult.do" method="post">
  <label for="vehicle search">Select Options: </label><br>
  <select name="model">
    <option value="">  Model  </option>
    <option value="XC90">XC90</option>
    <option value="XC60">XC60</option>
    <option value="XC40">XC40</option>
    <option value="S90">S90</option>
    <option value="S60">S60</option>
    <option value="V90">V90</option>
    <option value="V60">V60</option>
  </select>
  <select name="trim">
    <option value="">  Trim  </option>
    <option value="Momentum">Momentum</option>
    <option value="R-Design">R-Design</option>
    <option value="Inscription">Inscription</option>
  </select>
  <select name="color">
    <option value="">  Color  </option>
    <option value="Fusion Red Metallic">Red</option>
    <option value="Crystal Metallic White">White</option>
    <option value="Osmium Gray Metallic">Gray</option>
    <option value="Denim Blue Metallic">Blue</option>
    <option value="Onyx Black Metallic">Black</option>
  </select>
  <select name="drivetrain">
    <option value="">  Drivetrain  </option>
    <option value="AWD">All-Wheel Drive</option>
    <option value="FWD">Front-Wheel Drive</option>
  </select>
  <br>
  Model Year: <input type="text" name="modelYear">
  <br>
  Mileage: <input type="text" name="mileage">
  
  <br>
  <input type="submit" value="Submit"/>
 </form>

</body>
</html>