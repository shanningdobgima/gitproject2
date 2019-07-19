package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Lanceur {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SecondJpaProject");
		EntityManager em = emf.createEntityManager();

		Adresse a1 = new Adresse("A1", "A1");
		Adresse a2 = new Adresse("A2", "A2");
		Adresse a3 = new Adresse("A3", "A3");
		Adresse a4 = new Adresse("A4", "A4");
		Adresse a5 = new Adresse("A5", "A5");

		Personne p1 = new Personne("p1", "p1");
		Personne p2 = new Personne("p2", "p2");

		List<Adresse> list = new ArrayList<Adresse>();
		list.add(a2);
		list.add(a3);

		p1.setAdress(list);

		List<Adresse> list2 = new ArrayList<Adresse>();
		list2.add(a1);
		list2.add(a4);
		list2.add(a5);

		p2.setAdress(list2);

		em.getTransaction().begin();

		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(a4);
		em.persist(a5);

		em.persist(p1);
		em.persist(p2);

		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
