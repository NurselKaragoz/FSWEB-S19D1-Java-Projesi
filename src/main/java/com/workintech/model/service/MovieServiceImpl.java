package com.workintech.model.service;

import com.workintech.model.entity.Movie;
import com.workintech.model.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public Iterable<Movie> getAllMovies() {
        return null;
    }

    @Override
    public Movie getMovieById(Long id) {
        return null;
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return null;
    }

    @Override
    public Movie updateMovie(Long id, Movie movie) {
        return null;
    }

    @Override
    public void deleteMovie(Long id) {

    }
}
