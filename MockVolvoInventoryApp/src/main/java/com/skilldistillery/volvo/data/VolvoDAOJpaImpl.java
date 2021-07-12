package com.skilldistillery.volvo.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.volvo.entities.Vehicle;

@Service
@Transactional
public class VolvoDAOJpaImpl implements VolvoDAO {

	@PersistenceContext
	private EntityManager em; 
	
	
	@Override
	public Vehicle findById(int id) {
		return em.find(Vehicle.class, id);
	}

	@Override
	public Vehicle findByColor(String color) {
		return em.find(Vehicle.class, color);
	}

	@Override
	public Vehicle findByModel(String model) {
		return em.find(Vehicle.class, model);
	}

	@Override
	public Vehicle findByTrim(String trim) {
		return em.find(Vehicle.class, trim);
	}

	@Override
	public Vehicle findByDrivetrain(String drivetrain) {
		return em.find(Vehicle.class, drivetrain);
	}

	@Override
	public Vehicle findByYear(int year) {
		return em.find(Vehicle.class, year);
	}

	@Override
	public List<Vehicle> showAll() {
		String jplq = "SELECT v FROM Vehicle v";
		List<Vehicle> vehicles = em.createQuery(jplq, Vehicle.class).getResultList();
		return vehicles;
	}

	
	
	//String trim, String color, String drivetrain, int modelYear
	@Override
	public List<Vehicle> searchResult(String modelType) {
		List<Vehicle> vehicles = null; 
		String jpql;
		
		if(modelType != null) {
			jpql = "SELECT v FROM Vehicle v WHERE v.model = :model";
			vehicles = em.createQuery(jpql, Vehicle.class)
					.getResultList();
		}
		
//		if(modelType != null && trim != null) {
//			jpql = "SELECT v FROM Vehicle v WHERE v.model = :model AND v.trim = :trim";
//			vehicles = em.createQuery(jpql, Vehicle.class)
//					.setParameter("model", modelType)
//					.setParameter("trim", trim)
//					.getResultList();
//		} 
		
//		if(trim != null) {
//			jpql = "SELECT v FROM Vehicle v WHERE trim = :trim";
//			vehicles = em.createQuery(jpql, Vehicle.class)
//					.getResultList();
//		}
		
		
		return vehicles; 
	}

	@Override
	public Vehicle addVolvo(Vehicle vehicle) {
		em.persist(vehicle);
		return vehicle; 
	}

	@Override
	public boolean destroyVolvo(int vid) {
		Vehicle vehicle = em.find(Vehicle.class, vid);
		em.remove(vehicle);
		boolean successfulRemove; 
		successfulRemove = !em.contains(vehicle); //True => false; False => true; 
		return successfulRemove;
	}
	
	@Override
	public Vehicle updateVolvo(int vid, Vehicle vehicle) {
		
		Vehicle dbVehicle = em.find(Vehicle.class, vid);
		dbVehicle.setModel(vehicle.getModel());
		dbVehicle.setTrim(vehicle.getTrim());
		dbVehicle.setColor(vehicle.getColor());
		dbVehicle.setDrivetrain(vehicle.getDrivetrain());
		dbVehicle.setMileage(vehicle.getMileage());

		return dbVehicle;
	}
	
}
