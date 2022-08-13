package com.xworkz.lipstick;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.lipstick.dao.LipstickDAO;
import com.xworkz.lipstick.dao.LipstickDAOImpl;
import com.xworkz.lipstick.entity.LipstickEntity;


public class LipstickRunner {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("This is testing");
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			System.out.println(entityManager.isOpen());

			EntityTransaction entityTransaction = entityManager.getTransaction();

			LipstickEntity entity = new LipstickEntity();
			entity.setId(2);
			entity.setBrand("mat");
			entity.setColor("cherry red");
			entity.setPrice(350d);
			entity.setCreateBy("adhya");
			entity.setCreateDate(LocalDate.of(2018, 02, 11));
			entity.setUpdateBy("prathi");
			entity.setUpdateDate(LocalDate.now());

			entityTransaction.begin();

			entityManager.persist(entity);// sQL--->

			entityTransaction.commit(); // exuecte-->exception
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		LipstickDAO dao = new LipstickDAOImpl();

		LipstickEntity le = dao.findById(1);
		System.out.println(le);

		dao.updateBrandAndColorById("lakme", "brown", 1);

	}

}
