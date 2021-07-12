# JPACRUDProject

## About this Project

* This Project showcases a Mock Volvo Vehicle Inventory Site
* This Website is connected to an SQL Database which stores Vehicle Inventory
* The Database was created through MySql Workbench
* Users of this Website are able to retrieve a Vehicle's Info that contains:
  * Unique ID Number (this represents the VIN)
  * Model Year
  * Model
  * Trim Level
  * Color
  * Drivetrain
  * Dealership ID
  * Mileage
  * Image of the Vehicle
* The Dealership ID is meant to be connected with a Join Table
  * The Join table would connect with a Table of Dealership Names so that the User may see this and go to that specific Dealership's own Website

## Site Navigation

* The Website's Home Index contains an Option to:
  * All the Volvo Vehicle Inventory available
  * Search for a Volvo
  * Add or Update a Volvo
* Selecting the 'Show all Inventory':
  * The User will be redirected to a Page that lists all available Inventory that shows the Volvo's Year and Model
  * Each listed Volvo can be selected to show all the information about it
* Selecting 'Search for a Volvo':
  * The User will be redirected to a Page that has a Web Form with drop-down Menus
  * When all desired Search Criteria are selected, the User will click 'Submit' and be redirected to the results
* Selecting 'Add or Update a Volvo':
    * The User is redirected to further selected 'Add a new Volvo' or 'Update an existing Volvo'
      * Adding a Volvo is similar to the Search Web Form, only submitting this information will add another Volvo to the Database
* Additionally, when viewing a Volvo's total Information, the User may select to 'Delete' or 'Update' that particular Volvo
  * Selecting Delete will show a Browser alert
    * Continuing will then redirect the User and inform them if the process was sucessful -- a Home button will lead the User out of that Page

## Technologies Used
  * Java
  * JPA
  * Spring MVC
  * Gradle
  * SQL
  * MySql Workbench
  * HTML/CSS
