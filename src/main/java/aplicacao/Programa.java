package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		// Pessoa p1 = new Pessoa (null, "Joao da Costa", "joao@gmail.com");
		// Pessoa p2 = new Pessoa (null, "Maria da Silva", "maria@gmail.com");
		// Pessoa p3 = new Pessoa (null, "José Silva", "jose@gmail.com");
	
				
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); //exemplo jpa é apelido pro banco, criado lá no persistence.xml
		EntityManager em = emf.createEntityManager();
		
		
		// para fazer uma pesquisa, na tabela pessoa, id = 2 
		Pessoa p = em.find(Pessoa.class, 2);
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
		
		
		System.out.println(p);
		
		
		
		//Vai gravar esses dados na tabela!
		// em.getTransaction().begin();
		//	em.persist(p1);
		//	em.persist(p2);
		//	em.persist(p3);
		//	em.getTransaction().commit();
		
		
		
		
		System.out.println("Pronto!!!");
		
		
		
		

	}

}
