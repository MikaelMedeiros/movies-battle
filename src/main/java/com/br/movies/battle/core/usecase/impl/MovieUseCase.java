package com.br.movies.battle.core.usecase.impl;

import com.br.movies.battle.core.domain.Movie;
import com.br.movies.battle.core.port.MoviePortOut;
import com.br.movies.battle.core.usecase.IMovieUseCase;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MovieUseCase implements IMovieUseCase {

    private final MoviePortOut moviePortOut;

    @Override
    public List<Movie> getMovies(String search) {
        return null;
    }

}
