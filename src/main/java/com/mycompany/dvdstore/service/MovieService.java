package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.MovieEntity;
import com.mycompany.dvdstore.repository.MovieRepository;

public class MovieService {

    private MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(MovieEntity movieEntity) {

    movieRepository.add(movieEntity);

    }


}
