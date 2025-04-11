package fr.utbm.repository;

import org.hibernate.Session;

import fr.utbm.core.util.HibernateUtil;
import jakarta.transaction.Transaction;

public class HibernateMovieDao {
    public void save (String title, Integer copies, ) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            //start a transaction
            transaction = session.beginTransaction();

            // save the movie objects            
            session.save();
            
            // commit transaction
            transaction.commit();
        
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}
