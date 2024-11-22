package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    public List<Movies> findAllMovies() {
        return repository.findAll();
    }

    public Optional<Movies> signleMovies(String imdbId){
        return repository.findByimdbId(imdbId);
    }
}
