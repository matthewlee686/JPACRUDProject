package com.skilldistillery.volvo.data;

import com.skilldistillery.volvo.entities.Vehicle;

public interface VolvoDAO {
	Vehicle findById(int id);
}
