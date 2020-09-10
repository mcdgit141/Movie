package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private List<MovieEntity> movieEntities = new ArrayList<>();

    public void add (MovieEntity movieEntity){

        movieEntities.add(movieEntity);

        System.out.println("Le film " + movieEntity.getTitle() + " a bien été enregistré, son genre est " + movieEntity.getGenre() );
    }

}
