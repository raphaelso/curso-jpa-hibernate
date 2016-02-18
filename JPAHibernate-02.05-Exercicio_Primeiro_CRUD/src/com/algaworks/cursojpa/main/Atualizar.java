package com.algaworks.cursojpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.cursojpa.modelo.Agenda;

public class Atualizar {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agendaPU");
		EntityManager em = emf.createEntityManager();
		
		Agenda agenda = em.find(Agenda.class, 3L);
		
		em.getTransaction().begin();
		agenda.setNome("Bruna Possetti Garcia Oliveira 2");
		em.getTransaction().commit();
		
		System.out.println("Agenda atualizada com sucesso!");
	}

}
