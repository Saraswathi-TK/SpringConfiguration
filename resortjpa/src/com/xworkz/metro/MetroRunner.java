package com.xworkz.metro;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.metro.dao.MetroDAO;
import com.xworkz.metro.dao.MetroDAOImpl;
import com.xworkz.metro.entity.MetroEntity;


public class MetroRunner {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("This is testing");
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			System.out.println(entityManager.isOpen());

			EntityTransaction entityTransaction = entityManager.getTransaction();

			MetroEntity metroEntity = new MetroEntity();
			metroEntity.setId(2);
			metroEntity.setName("NammaMetro");
			metroEntity.setDistination("Banglore");
			metroEntity.setRestRoom(true);
			metroEntity.setCheckInTime(LocalTime.of(6, 00));
			metroEntity.setCheckOutTime(LocalTime.of(12, 00));
			metroEntity.setCreatedBy("NarendraaModi");
			metroEntity.setCreatedDate(LocalDate.now());
			metroEntity.setUpdatedDate(LocalDate.now());

			entityTransaction.begin();

			entityManager.persist(metroEntity);// sQL--->

			entityTransaction.commit(); // exuecte-->exception
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		MetroDAO dao = new MetroDAOImpl();
		MetroEntity entity = dao.findById(2);
		System.out.println(entity);

		dao.updatedistinationById("Banashankari", 1);
	}

	}

