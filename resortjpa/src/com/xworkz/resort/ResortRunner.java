package com.xworkz.resort;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.entity.ResortEntity;

public class ResortRunner {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("This is testing");
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			System.out.println(entityManager.isOpen());

			EntityTransaction entityTransaction = entityManager.getTransaction();

			ResortEntity resortEntity = new ResortEntity();
			resortEntity.setId(4);
			resortEntity.setName("Honey");
			resortEntity.setLocation("MG Road");
			resortEntity.setOwner("Pratibha");
			resortEntity.setCheckInTime(LocalTime.of(12, 00));
			resortEntity.setCheckOutTime(LocalTime.of(11, 00));
			resortEntity.setCreatedBy("Om");
			resortEntity.setCreatedDate(LocalDate.now());
			resortEntity.setPricePerDay(2000D);
			resortEntity.setUpdateDate(LocalDate.now());

			entityTransaction.begin();

			entityManager.persist(resortEntity);// sQL--->

			entityTransaction.commit(); // exuecte-->exception
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		ResortDAO dao = new ResortDAOImpl();
		ResortEntity entity = dao.findById(2);
		System.out.println(entity);

		dao.updateOwnerAndLocationById("Saraswathi", "Chickmagalur", 1);
	}

}
