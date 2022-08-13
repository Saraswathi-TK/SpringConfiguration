package com.xworkz.restaurant;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.restaurant.dao.RestaurantDAO;
import com.xworkz.restaurant.dao.RestaurantDAOImpl;
import com.xworkz.restaurant.entity.RestaurantEntity;


public class RestaurantRunner {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("This is testing");
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			System.out.println(entityManager.isOpen());

			EntityTransaction entityTransaction = entityManager.getTransaction();

			RestaurantEntity restauranttEntity = new RestaurantEntity();
			restauranttEntity.setId(1);
			restauranttEntity.setName("Suruchi");
			restauranttEntity.setLocation("kadur");
			restauranttEntity.setOwner("kumar");
			restauranttEntity.setCheckInTime(LocalTime.of(12, 00));
			restauranttEntity.setCheckOutTime(LocalTime.of(11, 00));
			restauranttEntity.setCreatedBy("Jai");
			restauranttEntity.setCreatedDate(LocalDate.now());
			restauranttEntity.setUpdateDate(LocalDate.now());

			entityTransaction.begin();

			entityManager.persist(restauranttEntity);// sQL--->

			entityTransaction.commit(); // exuecte-->exception
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		RestaurantDAO dao = new RestaurantDAOImpl();
		RestaurantEntity entity = dao.findById(2);
		System.out.println(entity);

		dao.updateOwnerAndLocationById("shashikumar", "Kadur", 1);
	}

}
