package com.skilldistillery.volvo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(name="year")
	private int modelYear;
	
	private String model;
	
	private String trim;
	
	private String color;
	
	private String drivetrain;
	
	@Column(name="dealer_id")
	private Integer dealerId;
	
	private int mileage;
	
	@Column(name="image")
	private String pic; 

	//no-arg constructor
	public Vehicle(){
		super();
	}

	//methods
	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTrim() {
		return trim;
	}

	public void setTrim(String trim) {
		this.trim = trim;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDrivetrain() {
		return drivetrain;
	}

	public void setDrivetrain(String drivetrain) {
		this.drivetrain = drivetrain;
	}

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(Integer dealerId) {
		this.dealerId = dealerId;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", modelYear=" + modelYear + ", model=" + model + ", trim=" + trim + ", color="
				+ color + ", drivetrain=" + drivetrain + ", dealerId=" + dealerId + ", mileage=" + mileage + "]";
	}

}	
