package com.algaworks.cursojpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.cursojpa.modelo.Agenda;

public class Atualizar {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicioCRUD");
		EntityManager em = emf.createEntityManager();
		
		Agenda agenda = em.find(Agenda.class, 2L);
		
		em.getTransaction().begin();
		agenda.setNome("Bruna Possetti Garcia Oliveira");
		em.getTransaction().commit();
		
		System.out.println("Agenda atualizada com sucesso!");
	}

}
