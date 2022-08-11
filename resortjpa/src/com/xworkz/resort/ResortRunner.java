package com.xworkz.resort;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.entity.ResortEntity;

public class ResortRunner {

	public static void main(String[] args) {

		ResortEntity resortEntity = new ResortEntity();
		resortEntity.setId(2);
		resortEntity.setName("Badra");
		resortEntity.setLocation("Bhadravati");
		resortEntity.setCheckInTime(LocalTime.of(12, 00));
		resortEntity.setCheckOutTime(LocalTime.of(11, 0));
		resortEntity.setCreatedBy("Om");
		resortEntity.setCreatedDate(LocalDate.now());
		resortEntity.setOwner("Sanjay");
		resortEntity.setPricePerDay(2000D);
		
		ResortDAO dao = new ResortDAOImpl();

		boolean saved = dao.save(resortEntity);
		System.out.println(resortEntity);
	}

	
}
