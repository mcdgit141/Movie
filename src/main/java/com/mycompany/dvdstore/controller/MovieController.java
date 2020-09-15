package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.MovieEntity;
import com.mycompany.dvdstore.service.MovieService;
import com.mycompany.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {

    MovieServiceInterface movieService;

    public void addUsingConsole(){

        System.out.println( "Veuillez saisir le titre du film" );

        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        System.out.println( "Veuillez saisir le genre du film" );

        Scanner sc1 = new Scanner(System.in);
        String genre = sc1.nextLine();

        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setTitle(title);
        movieEntity.setGenre(genre);

        MovieService movieService = new MovieService();
        movieService.registerMovie(movieEntity);

    }
}
