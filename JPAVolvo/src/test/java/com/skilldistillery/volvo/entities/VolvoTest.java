package com.skilldistillery.volvo.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VolvoTest {

	private static EntityManagerFactory emf;
	private EntityManager em; 
	private Vehicle vehicle; 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("VehiclePU");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		vehicle = em.find(Vehicle.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		vehicle = null;
	}

	@Test
	@DisplayName("Test Vehicle Entity Mapping")
	void test() {
		assertNotNull(vehicle);
		assertEquals("XC90", vehicle.getModel());
	}

}
