package com.br.movies.battle.core.port;

import com.br.movies.battle.core.domain.Movie;

import java.util.List;

public interface MoviePortOut {

    Movie getMovie(String idMovie);

    List<Movie> getMovies(String search);

}
