package com.workintech.model.service;

import com.workintech.model.entity.Actor;
import com.workintech.model.entity.Movie;
import com.workintech.model.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Long id) {

        Optional< Movie> findMovie= movieRepository.findById(id);
        if(findMovie.isPresent()){
            return findMovie.get();
        }
        throw new RuntimeException();
    };


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
