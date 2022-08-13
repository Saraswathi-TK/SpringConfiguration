package com.xworkz.bucket.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.bucket.entity.BucketEntity;

public class BucketDAOImpl implements BucketDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(BucketEntity entity) {
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
			manager.close();
			factory.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public BucketEntity findById(int id) {
		EntityManager manager = null;
		try {
			manager = this.factory.createEntityManager();
			BucketEntity entity = manager.find(BucketEntity.class, id);
			if (entity != null) {
				System.out.println("bucket entity is found for brand" + id);
				return entity;
			} else {
				System.out.println("bucket entity is not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}
		return null;
	}

	@Override
	public void updateBrandAndColorById(String brand, String color, int id) {
		EntityManager manager = null;
		try {
			manager = this.factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			BucketEntity entity = manager.find(BucketEntity.class, id);
			if (entity != null) {
				System.out.println("bucket entity found for id" + id);
				entity.setBrand(brand);
				entity.setColor(color);
				manager.merge(entity);
			}
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}

	}

}
