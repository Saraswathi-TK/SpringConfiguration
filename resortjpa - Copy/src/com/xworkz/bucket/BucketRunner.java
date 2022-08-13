package com.xworkz.bucket;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.bucket.dao.BucketDAO;
import com.xworkz.bucket.dao.BucketDAOImpl;
import com.xworkz.bucket.entity.BucketEntity;

public class BucketRunner {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("This is testing");
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			System.out.println(entityManager.isOpen());

			EntityTransaction entityTransaction = entityManager.getTransaction();
			BucketEntity entity = new BucketEntity();
			entity.setId(3);
			entity.setBrand("lucky");
			entity.setColor("green");
			entity.setPrice(200f);
			entity.setType("fiber");
			entity.setCreateBy("prema");
			entity.setCreateDate(LocalDate.of(2012, 10, 30));
			entity.setUpdateBy("ranju");
			entity.setUpdateDate(LocalDate.now());

			entityTransaction.begin();

			entityManager.persist(entity);// sQL--->

			entityTransaction.commit(); // exuecte-->exception
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

		BucketDAO dao = new BucketDAOImpl();

		BucketEntity bk = dao.findById(1);
		System.out.println(bk);

		dao.updateBrandAndColorById("suhas", "grey", 1);

	}

}
