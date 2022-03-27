package com.br.movies.battle.adapters.mapper;

import com.br.movies.battle.adapters.database.entity.MatchEntity;
import com.br.movies.battle.core.domain.Match;
import org.springframework.stereotype.Component;

@Component
public class MatchMapper {

    public MatchEntity matchDomainToEntity(Match match) {
        return new MatchEntity();
    };

}
