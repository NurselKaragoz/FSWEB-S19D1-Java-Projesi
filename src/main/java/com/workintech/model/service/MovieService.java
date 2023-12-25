package com.workintech.model.service;

import com.workintech.model.entity.Movie;

public interface MovieService {
    Iterable<Movie> getAllMovies();
    Movie getMovieById(Long id);
    Movie saveMovie(Movie movie);
    Movie updateMovie(Long id, Movie movie);
    void deleteMovie(Long id);
}
