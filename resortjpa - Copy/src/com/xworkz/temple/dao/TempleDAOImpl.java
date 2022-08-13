package com.xworkz.temple.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.temple.entity.TempleEntity;

public class TempleDAOImpl implements TempleDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(TempleEntity entity) {
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
			manager.close();
			factory.close();
		} catch (PersistenceException exception) {
			exception.printStackTrace();

		}
		return false;

	}

	@Override
	public TempleEntity findById(int pk) {
		System.out.println("running findById" + pk);
		EntityManager entityManager = null;
		try {
			entityManager = factory.createEntityManager();
			TempleEntity entity = entityManager.find(TempleEntity.class, pk);
			if (entity != null) {
				System.out.println("resort entity is found for id" + pk);
				return entity;
			} else {
				System.err.println("resort entity is not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();

		}

		return null;
	}

	@Override
	public void updatednameById(String newname, int id) {
		EntityManager entityManager = this.factory.createEntityManager();
		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			TempleEntity entity = entityManager.find(TempleEntity.class, id);
			if (entity != null) {
				System.out.println("entity found for id" + id + " can update");
				entity.setName(newname);
				entityManager.merge(entity);
			}
			tx.commit();
		} catch (Exception e) {

		} finally {
			entityManager.close();
		}
	}

}
