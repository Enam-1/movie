package fr.utbm;

import fr.utbm.controller.DefaultMovieController;
import fr.utbm.repository.FileMovieDao;
import fr.utbm.repository.HibernateMovieDao;

import java.util.Calendar;

import fr.utbm.entity.Movie;
import fr.utbm.entity.Test;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AppEntity {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie");
    private static EntityManager entityManager = emf.createEntityManager();

    public static void main(String[] args) {
        /* 
        Test t = new Test();
        t.setDate(Calendar.getInstance().getTime());
        t.setLabel("test");
        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.getTransaction().commit();
        */

//        DefaultMovieController regMovie = new DefaultMovieController();
        Movie film =  regMovie.registerMovieFromConsoleInput();

//        FileMovieDao fileMovie = new FileMovieDao();
//        fileMovie.save(film.getTitle(), film.getCopies());

        DefaultMovieController
    }
}
