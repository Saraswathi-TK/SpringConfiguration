package com.xworkz.lipstick.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.lipstick.entity.LipstickEntity;

public class LipstickDAOImpl implements LipstickDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(LipstickEntity entity) {
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
	public LipstickEntity findById(int id) {
		EntityManager manager = null;
		try {
			manager = this.factory.createEntityManager();
			LipstickEntity entity = manager.find(LipstickEntity.class, id);
			if (entity != null) {
				System.out.println("lisptick entity is found for brand" + id);
				return entity;
			} else {
				System.out.println("lipstick entity is not found");
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
			LipstickEntity entity = manager.find(LipstickEntity.class, id);
			if (entity != null) {
				System.out.println("lipstick entity found for id" + id);
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
