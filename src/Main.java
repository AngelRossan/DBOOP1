import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import Models.*;



public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf=
                Persistence.createEntityManagerFactory("C:/objectdb/db/cliente.odb");
        EntityManager em=
                emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(new Cliente("Angel","2223785121","angelrossan25@gmail.com","25/05/2003" ));
        em.getTransaction().commit();

        TypedQuery<Cliente> q =em.createQuery("Select p FROM Cliente p", Cliente.class);
        for(Cliente p : q.getResultList()){
            System.out.println("Cliente: "+p.getNombre());
        }

        em.close();
        emf.close();
    }
}
