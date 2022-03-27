package com.br.movies.battle.core.usecase;

import com.br.movies.battle.core.domain.Movie;

import java.util.List;

public interface IMovieUseCase {

    List<Movie> getMovies(String search);

}
