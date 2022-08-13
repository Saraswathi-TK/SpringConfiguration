package com.xworkz.metro.dao;

import com.xworkz.metro.entity.MetroEntity;

public interface MetroDAO {

	boolean save(MetroEntity entity);
	
    MetroEntity findById(int pk);
	
	void updatedistinationById(String newdistination,int id);

}
