package com.br.movies.battle.adapters.gateway;

import com.br.movies.battle.adapters.client.ImbdClient;
import com.br.movies.battle.adapters.mapper.MovieMapper;
import com.br.movies.battle.core.domain.Movie;
import com.br.movies.battle.core.port.MoviePortOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MovieGateway implements MoviePortOut {

    private final MovieMapper mapper;
    private final ImbdClient client;


    @Override
    public Movie getMovie(String idMovie) {
        var response = client.getMovie(idMovie);
        return mapper.iMDBResponseToDomain(response);
    }

    @Override
    public List<Movie> getMovies(String search) {
        return null;
    }
}
