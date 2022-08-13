package com.xworkz.rocket.dao;

import java.time.LocalDate;

import com.xworkz.rocket.entity.RocketEntity;

public interface RocketDAO {

	boolean save(RocketEntity entity);

	RocketEntity findByPrice(double price);

	void updateNameAndCreateDateById(String name, LocalDate date, int id);
}
