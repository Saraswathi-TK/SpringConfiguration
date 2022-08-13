package com.xworkz.temple.dao;

import com.xworkz.temple.entity.TempleEntity;

public interface TempleDAO {

boolean save(TempleEntity entity);
	
    TempleEntity findById(int pk);
	
	void updatednameById(String newname,int id);
}
