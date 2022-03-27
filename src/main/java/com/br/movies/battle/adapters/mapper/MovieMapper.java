package com.br.movies.battle.adapters.mapper;

import com.br.movies.battle.adapters.client.response.ImbdResponse;
import com.br.movies.battle.adapters.database.entity.MovieEntity;
import com.br.movies.battle.adapters.rest.dto.MovieDTO;
import com.br.movies.battle.core.domain.Movie;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MovieMapper {

    public Movie entityToDTO(MovieEntity entity) {
        return Movie.builder()
                .id(entity.getId())
                .rating(entity.getRating())
                .title(entity.getTitle())
                .votes(entity.getVotes())
                .build();
    }

    public List<Movie> entityToDomain(List<MovieEntity> movies) {
        return movies.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public Movie iMDBResponseToDomain(ImbdResponse response) {
        return Movie.builder()
                .votes(convertToInteger(response.getImdbVotes()))
                .title(response.getTitle())
                .rating(convertToFloat(response.getImdbRating()))
                .id(response.getImdbID())
                .build();

    }

    private Integer convertToInteger(String imdbVotes) {
        try {
            return Integer.parseInt(imdbVotes);
        } catch (NumberFormatException error) {
            return 0;
        }
    }

    private Float convertToFloat(String imdbRating) {
        try {
            return Float.parseFloat(imdbRating);
        } catch (NumberFormatException error) {
            return 0.0f;
        }
    }
}
