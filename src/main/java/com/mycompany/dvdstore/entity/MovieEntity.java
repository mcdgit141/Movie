package com.mycompany.dvdstore.entity;

import java.util.ArrayList;
import java.util.List;

public class MovieEntity {

    private String title;
    private String nbreExemplaire;
    private String genre;
    private String acteurPrincipal;
    private List<String> acteurAutres = new ArrayList<>();

    public MovieEntity() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNbreExemplaire() {
        return nbreExemplaire;
    }

    public void setNbreExemplaire(String nbreExemplaire) {
        this.nbreExemplaire = nbreExemplaire;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getActeurPrincipal() {
        return acteurPrincipal;
    }

    public void setActeurPrincipal(String acteurPrincipal) {
        this.acteurPrincipal = acteurPrincipal;
    }

    public List<String> getActeurAutres() {
        return acteurAutres;
    }

    public void setActeurAutres(List<String> acteurAutres) {
        this.acteurAutres = acteurAutres;
    }
}
