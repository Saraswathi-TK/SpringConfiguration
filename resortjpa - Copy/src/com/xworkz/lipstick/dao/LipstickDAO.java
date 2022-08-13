package com.xworkz.lipstick.dao;

import com.xworkz.lipstick.entity.LipstickEntity;

public interface LipstickDAO {

	boolean save(LipstickEntity entity);

	LipstickEntity findById(int id);

	void updateBrandAndColorById(String brand, String color, int id);

}
