package com.algaworks.cursojpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.cursojpa.modelo.Agenda;

public class Remover {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicioCRUD");
		EntityManager em = emf.createEntityManager();
		
		Agenda agenda = em.find(Agenda.class, 3L);
		
		em.getTransaction().begin();
		em.remove(agenda);
		em.getTransaction().commit();
		
		System.out.println("Agenda removida com sucesso!");
	}

}
