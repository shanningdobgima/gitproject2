package controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dao.Adresse;
import dao.Personne;

public class FindByName {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("SecondJpaProject");
	EntityManager em = emf.createEntityManager();

	public void create(String nom, String prenom, String rue,String ville,String rue2,String ville2) {
		Personne p= new Personne(nom, prenom);
		Adresse a1= new Adresse(rue, ville);
		Adresse a2= new Adresse(rue2, ville2);
		List<Adresse> ad1=new ArrayList<Adresse>();
		ad1.add(a1);
		ad1.add(a2);
		p.setAdress(ad1);
		
		em.getTransaction().begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
//	public Adresse Findd(String nom, String prenom) {
//
//		Query qury = em.createNativeQuery("select * from personne where nom=? and prenom=?", dao.Personne.class);
//		qury.setParameter(1, nom);
//		qury.setParameter(2, prenom);
//
//		Personne pers = (Personne) qury.getSingleResult();
//
////		return pers.getAdress();
//
//	}
//
//	public void create(String fname, String lname, String pville, String prue) {
//		
//       Personne p= new Personne(fname, lname);
//       Adresse add= new Adresse(prue, pville);
//       
////       p.setAdress(add);
//       
//       em.getTransaction().begin();
//       em.persist(add);
//       em.persist(p);
//       
//       em.getTransaction().commit();
//       
//	}
}
