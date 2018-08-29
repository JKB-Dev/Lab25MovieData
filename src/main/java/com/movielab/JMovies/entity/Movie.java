package com.movielab.JMovies.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "movies")
public class Movie {
	@Id
	private Integer id;
	private String title;
	private String category;
	private int year;
	
	public Movie() {
	}

	public Movie(Integer id, String title, String category, int year) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.year = year;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", category=" + category + ", year=" + year + "]";
	}
	
	
	
	
}
