package com.xworkz.resort.dao;

import com.xworkz.resort.entity.ResortEntity;

public interface ResortDAO {

	
	boolean save(ResortEntity entity);
	
    ResortEntity findById(int pk);
	
	void updateOwnerAndLocationById(String newOwner,String newLocation,int id);

}
