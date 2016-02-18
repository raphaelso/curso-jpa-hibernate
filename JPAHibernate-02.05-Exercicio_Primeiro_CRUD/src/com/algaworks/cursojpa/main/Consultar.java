package com.algaworks.cursojpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.cursojpa.modelo.Agenda;

public class Consultar {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agendaPU");
		EntityManager em = emf.createEntityManager();
		
		Agenda agenda = em.find(Agenda.class, 3L);
		
		if (agenda != null ) {
			System.out.println("Nome: " + agenda.getNome());
			System.out.println("Telefone: " + agenda.getTelefone());
			System.out.println("Data do Registro: " + agenda.getDataRegistro());
		} else {
			System.out.println("Agenda não encontrada!");
		}
		
	}

}
