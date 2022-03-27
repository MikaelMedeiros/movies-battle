package com.br.movies.battle.adapters.mapper;

import com.br.movies.battle.adapters.database.entity.RoundEntity;
import com.br.movies.battle.adapters.rest.dto.RoundDTO;
import com.br.movies.battle.core.domain.Round;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class RoundMapper {

    private final MovieMapper movieMapper;

    public Round entityToDomain(RoundEntity entity) {
        return Round.builder()
                .id(entity.getId())
                .movies(movieMapper.entityToDomain(entity.getMovies()))
                .build();
    }

    public List<Round> entityListToDomain(List<RoundEntity> rounds) {
        return rounds.stream().map(this::entityToDomain).collect(Collectors.toList());
    }

}
