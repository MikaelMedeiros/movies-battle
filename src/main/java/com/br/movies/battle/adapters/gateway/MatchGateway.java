package com.br.movies.battle.adapters.gateway;

import com.br.movies.battle.adapters.database.repository.MatchRepository;
import com.br.movies.battle.adapters.mapper.MatchMapper;
import com.br.movies.battle.core.domain.Match;
import com.br.movies.battle.core.port.MatchPortOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MatchGateway implements MatchPortOut {

    private final MatchMapper mapper;
    private final MatchRepository repository;

    @Override
    public void save(Match match) {
        var entity = mapper.matchDomainToEntity(match);
        repository.save(entity);
    }
}
