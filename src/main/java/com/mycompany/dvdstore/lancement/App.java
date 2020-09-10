package com.mycompany.dvdstore.lancement;

import com.mycompany.dvdstore.entity.MovieEntity;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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
