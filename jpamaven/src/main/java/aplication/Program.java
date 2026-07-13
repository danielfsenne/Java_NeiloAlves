package aplication;

import dominio.People;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

    public static void main(String [] args){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        People p = em.find(People.class , 2);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println("Pronto");
        em.close();
        emf.close();
    }

}
