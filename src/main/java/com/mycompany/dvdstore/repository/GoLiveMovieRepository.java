package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.MovieEntity;

import java.io.FileWriter;
import java.io.IOException;

public class GoLiveMovieRepository implements MovieRepositoryInterface{

    public void add(MovieEntity movieEntity){

            FileWriter writer;
            try{
                writer=new FileWriter("C:\\temp\\movies.txt",true);
                writer.write(movieEntity.getTitle()+";"+movieEntity.getGenre()+"\n");
                writer.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            System.out.println("The movie "+movieEntity.getTitle()+" has been added.");
        }

}
