package com.xworkz.rocket;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.rocket.dao.RocketDAO;
import com.xworkz.rocket.dao.RocketDAOImpl;
import com.xworkz.rocket.entity.RocketEntity;

public class RocketRunner {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("This is testing");
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			System.out.println(entityManager.isOpen());

			EntityTransaction entityTransaction = entityManager.getTransaction();
			RocketEntity rocket = new RocketEntity();
			rocket.setId(1);
			rocket.setName("chandrayana");
			rocket.setSpeed(145.3f);
			rocket.setPrice(14200000.23d);
			rocket.setCreateBy("nambi narayanan");
			rocket.setCreateDate(LocalDate.of(2012, 8, 10));
			rocket.setUpdateBy("kalam");
			rocket.setUpdateDate(LocalDate.now());

			entityTransaction.begin();

			entityManager.persist(rocket);// sQL--->

			entityTransaction.commit(); // exuecte-->exception
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

		RocketDAO dao = new RocketDAOImpl();
		RocketEntity entity = dao.findByPrice(14200000.23d);
		System.out.println(entity);

		dao.updateNameAndCreateDateById("chand", LocalDate.now(), 1);

	}

}
