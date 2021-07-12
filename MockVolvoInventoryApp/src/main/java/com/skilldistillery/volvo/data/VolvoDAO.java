package com.skilldistillery.volvo.data;

import java.util.List;

import com.skilldistillery.volvo.entities.Vehicle;

public interface VolvoDAO {
	Vehicle findById(int id);
	Vehicle findByColor(String color); 
	Vehicle findByModel(String model);
	Vehicle findByTrim(String trim);
	Vehicle findByDrivetrain(String drivetrain);
	Vehicle findByYear(int year);
	List<Vehicle> showAll();
	
	//String modelType, String trim, String color, String drivetrain, int modelYear)
	List<Vehicle> searchResult(String modelType);
	
	Vehicle addVolvo(Vehicle vehicle);
	boolean destroyVolvo(int vid);
	Vehicle updateVolvo(int vid, Vehicle vehicle);
}
