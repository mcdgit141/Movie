package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.MovieEntity;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepository;

public class MovieService {

    private GoLiveMovieRepository movieRepository=new GoLiveMovieRepository();

    public void registerMovie(MovieEntity movieEntity) {

    movieRepository.add(movieEntity);

    }
}
