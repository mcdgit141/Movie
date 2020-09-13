package com.mycompany.dvdstore.lancement;

import com.mycompany.dvdstore.controller.MovieController;
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
        MovieController movieController = new MovieController();
        movieController.addUsingConsole();

    }
 }
