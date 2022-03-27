package com.br.movies.battle.adapters.mapper;

import com.br.movies.battle.adapters.database.entity.MatchEntity;
import com.br.movies.battle.adapters.rest.dto.MatchDTO;
import com.br.movies.battle.core.domain.Match;
import com.br.movies.battle.core.domain.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MatchMapper {

    private final RoundMapper roundMapper;
    private final PlayerMapper playerMapper;

    public MatchEntity matchDomainToEntity(Match match) {
        return new MatchEntity();
    };

    public MatchDTO matchDomainToDTO(Match match) {
         var dto = MatchDTO.builder()
                .welcome("Welcome " + match.getPlayer().getName())
                .question("Are you ready?")
                .next("")
                .build();
         dto.setNext();
        return dto;
    }

    public Match matchEntityToDomain(MatchEntity matchSaved) {
        return Match.builder()
                .id(Integer.parseInt(matchSaved.getId()))
                .rounds(roundMapper.entityListToDomain(matchSaved.getRounds()))
                .player(playerMapper.entityListToDomain(matchSaved.getPlayer()))
                .build();

    }
}
