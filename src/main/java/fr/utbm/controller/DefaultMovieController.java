package fr.utbm.controller;

import java.util.Scanner;
import fr.utbm.entity.Movie;

public class DefaultMovieController {
    public Movie registerMovieFromConsoleInput() {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Quel est le titre du film et le nombre de copies du film que vous souhaitez enregistrer?");
        String titre=sc.nextLine();
        Integer copies=sc1.nextInt();

        Movie movie1 = new Movie(titre, copies);
        return movie1;
    }
}
