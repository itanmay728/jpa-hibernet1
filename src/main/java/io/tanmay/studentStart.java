package io.tanmay;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class studentStart {

	public static void main(String[] args) {
		
		student obj = new student();
		
		obj.setRollNo(1);
		obj.setName("Tanmay");
		obj.setAge(23);
		obj.setEmail("ktanmay1130@gmail.com");
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Tanmay");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entiyTransaction = entityManager.getTransaction();
		
		entiyTransaction.begin();
		entityManager.persist(obj);
		entiyTransaction.commit();
	}

}
