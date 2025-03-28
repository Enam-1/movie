package fr.utbm.dvdstore.core.entity;

import java.io.Serializable;

public class Movie implements Serializable {

    private String title;
    private String movieType;
    private Integer copies;

    public String getTitle () {
        return title;
    }

    public String getMovieType () {
        return movieType;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public Movie(String title, String movieType, Integer copies) {
        this.title = title;
        this.movieType = movieType;
        this.copies = copies;
    }

    public Movie() {
    }
    
    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", movieType=" + movieType + ", copies=" + copies + '}';
    }
    

}
