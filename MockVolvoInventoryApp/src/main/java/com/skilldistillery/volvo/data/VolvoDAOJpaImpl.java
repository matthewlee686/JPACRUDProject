package com.skilldistillery.volvo.data;

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
	
}
