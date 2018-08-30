package com.movielab.JMovies;

import java.util.ArrayList;
import java.util.List;
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
	
	@GetMapping("random")
	public Movie random() {
		int randInt = (int) Math.ceil(Math.random() * (movieRepo.findAll().size()));
		Movie random = movieRepo.findById(randInt);
		return random;
	}
	
	@GetMapping("randcat/{category}")
	public Movie randcat(@PathVariable("category") String cat) {
		List<Movie> catForRand = movieRepo.findByCategory(cat);
		int randCatInt = (int) Math.ceil(Math.random() * catForRand.size()-1);
		Movie randCat = catForRand.get(randCatInt);
		return randCat;
	}
		
	@GetMapping("randquant/{quant}")
	public List<Movie> randByQuant(@PathVariable("quant") int quant) {
		ArrayList<Movie> randQuant = new ArrayList<>();
		if (quant < (movieRepo.findAll().size())) {
			for (int i = 0; i < quant; i++) {
				int randInt = (int) Math.ceil(Math.random() * (movieRepo.findAll().size()));
				randQuant.add(movieRepo.findById(randInt));
			}
		} else {
			return null;
		}
		return randQuant;
	}
	
	//TODO: list all categories
	
}
