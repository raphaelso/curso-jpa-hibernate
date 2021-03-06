package com.algaworks.cursojpa.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.cursojpa.modelo.Agenda;

public class Salvar {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agendaPU"); 
		EntityManager em = emf.createEntityManager();
		
		Agenda agenda = new Agenda();
		agenda.setNome("Bruna");
		agenda.setTelefone("22222222222");
		agenda.setDataRegistro(new Date());
		
		em.getTransaction().begin();
		em.persist(agenda);
		em.getTransaction().commit();
		
		System.out.println("Agenda salva com sucesso!");
		
	}

}
