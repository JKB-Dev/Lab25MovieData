package com.movielab.JMovies.dao;

import java.util.List;
import javax.persistence.Column;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.movielab.JMovies.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{
	
	List<Movie> findAll(); // list of all movies
	
	List<Movie> findByCategory(String category); // list of all in a category
	
	List<Movie> findByTitleContaining(String title); // list of movies with keyword in title
	
	List<Movie> findByTitle(String title); // find movie matching title
		
	// TODO: find a random movie: Movie findRandom
	//Movie getRandom();
	
	// TODO: find a random movie in a specific category //
	//Movie getRandomByCat(String category);
	
	// TODO: find a specific number of random movies // make a path variable
	//List<Movie> getRandomByQuant(int quant);
	
	//TODO: list all categories
//	@Query("select distinct category from movies")
//	@Column(name="category")
//	List<String> findCategories();
	//String getCategory();
	
	
}
