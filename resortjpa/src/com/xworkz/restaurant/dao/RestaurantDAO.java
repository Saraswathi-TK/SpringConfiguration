package com.xworkz.restaurant.dao;

import com.xworkz.restaurant.entity.RestaurantEntity;

public interface RestaurantDAO {

	boolean save(RestaurantEntity entity);

	RestaurantEntity findById(int pk);

	void updateOwnerAndLocationById(String newOwner, String newLocation, int id);

}
