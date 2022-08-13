package com.xworkz.metro.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.metro.entity.MetroEntity;
import com.xworkz.resort.entity.ResortEntity;

public class MetroDAOImpl implements MetroDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(MetroEntity entity) {
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
	public MetroEntity findById(int pk) {
		System.out.println("running findById" + pk);
		EntityManager entityManager = null;
		try {
			entityManager = factory.createEntityManager();
			MetroEntity entity = entityManager.find(MetroEntity.class, pk);
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
	public void updatedistinationById(String newdistination, int id) {
		EntityManager entityManager = this.factory.createEntityManager();
		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			MetroEntity entity = entityManager.find(MetroEntity.class, id);
			if (entity != null) {
				System.out.println("entity found for id" + id + " can update");
				entity.setDistination(newdistination);
				entityManager.merge(entity);// update sql
			}
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			entityManager.close();
		}
	}

}
