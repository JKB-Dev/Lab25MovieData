package com.movielab.JMovies;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.movielab.JMovies.dao.MovieRepository;
import com.movielab.JMovies.entity.Movie;

@RestController
public class JMovieController {

	@Autowired
	MovieRepository movieRepo;
	
	@GetMapping("/")
	public List<Movie> listAll() {
		return movieRepo.findAll();
	}
	
	@GetMapping("bycategory/{category}")
	public List<Movie> searchByCat(@PathVariable("category") String cat){
		return movieRepo.findByCategory(cat);
	}
	
	@GetMapping("details/{title}")
	public List<Movie>listDetails(@PathVariable("title") String title) {
		return movieRepo.findByTitle(title);
	}
	
	@GetMapping("containing/{keyword}")
	public List<Movie> searchKeyword(@PathVariable("keyword") String keyword) {
		return movieRepo.findByTitleContaining(keyword);
	}
	
	//TODO: random movie pick
	
	//TODO: random from category
		
	//TODO: random by specific quantity

	//TODO: list all categories
}
