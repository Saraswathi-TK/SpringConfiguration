package com.xworkz.temple;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.temple.dao.TempleDAO;
import com.xworkz.temple.dao.TempleDAOImpl;
import com.xworkz.temple.entity.TempleEntity;



public class TempleRunner {
	
	public static void main(String[] args) {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
	System.out.println("This is testing");
	EntityManager entityManager = null;
	try {
		entityManager = entityManagerFactory.createEntityManager();
		System.out.println(entityManager.isOpen());

		EntityTransaction entityTransaction = entityManager.getTransaction();

		TempleEntity templeEntity = new TempleEntity();
		templeEntity .setId(2);
		templeEntity .setName("Shreenivasa");
		templeEntity .setLocation("mico");
		templeEntity .setPrasadha(true);
		templeEntity .setCheckInTime(LocalTime.of(6, 00));
		templeEntity .setCheckOutTime(LocalTime.of(12, 00));
		templeEntity .setCreatedBy("Sanjay");
		templeEntity .setCreatedDate(LocalDate.now());
		templeEntity .setUpdatedDate(LocalDate.now());

		entityTransaction.begin();

		entityManager.persist(templeEntity );// sQL--->

		entityTransaction.commit(); // exuecte-->exception
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		entityManager.close();
	}
	TempleDAO dao = new TempleDAOImpl();
	TempleEntity entity = dao.findById(2);
	System.out.println(entity);

	dao.updatednameById("Banashankari", 1);
}

	
	
}
