package fr.utbm.repository;

import java.io.FileWriter;
import java.io.IOException;

public class FileMovieDao {
    public void save(String title, Integer copies){
        FileWriter writer;
        try{
                writer=new FileWriter("C:\\temp\films.txt",true);
                System.out.println("Titre :\n"+title+"Nombre d'exemplaire :\n"+copies);
                writer.close();
                System.out.println("Film enregistré avec succès");
        }catch(IOException e){
                System.err.println("Erreur liée à l'enregistrement du film");
        }
    }
}
