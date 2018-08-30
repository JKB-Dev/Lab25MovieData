package com.movielab.JMovies.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.movielab.JMovies.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{
	
	List<Movie> findAll(); // list of all movies
	
	List<Movie> findByCategory(String category); // list of all in a category
	
	List<Movie> findByTitleContaining(String title); // list of movies with keyword in title
	
	List<Movie> findByTitle(String title); // find movie matching title
		
	Movie findById(int id); // use to implement random
	
	//TODO: list all categories
	//createNativeQuery("select distinct category from movies");
	
}
