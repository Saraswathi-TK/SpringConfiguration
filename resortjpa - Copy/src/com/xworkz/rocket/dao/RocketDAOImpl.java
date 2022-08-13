package com.xworkz.rocket.dao;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.rocket.entity.RocketEntity;

public class RocketDAOImpl implements RocketDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(RocketEntity entity) {
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
	public RocketEntity findByPrice(double price) {
		EntityManager manager = null;
		try {
			manager = this.factory.createEntityManager();
			RocketEntity entity = manager.find(RocketEntity.class, price);
			if (entity != null) {
				System.out.println("hotel entity is found for brand" + price);
				return entity;
			} else {
				System.out.println("hotel entity is not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}
		return null;
	}

	@Override
	public void updateNameAndCreateDateById(String name, LocalDate date, int id) {
		EntityManager manager = null;
		try {
			manager = this.factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			RocketEntity entity = manager.find(RocketEntity.class, id);
			if (entity != null) {
				System.out.println("hotel entity found for id" + id);
				entity.setName(name);
				entity.setUpdateDate(date);
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
