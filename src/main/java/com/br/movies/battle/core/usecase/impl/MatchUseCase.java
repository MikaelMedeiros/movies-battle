package com.br.movies.battle.core.usecase.impl;

import com.br.movies.battle.core.domain.Match;
import com.br.movies.battle.core.port.MatchPortOut;
import com.br.movies.battle.core.usecase.IMatchUseCase;
import com.br.movies.battle.core.usecase.IPlayerUseCase;
import com.br.movies.battle.core.usecase.IRoundUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MatchUseCase implements IMatchUseCase {

    private final IPlayerUseCase playerUseCase;
    private final IRoundUseCase roundUseCase;
    private final MatchPortOut matchPortOut;

    @Override
    public Match startMatch(Integer idPlayer) {
        var playerFound = playerUseCase.findPlayer(idPlayer);
        var generatedRounds = roundUseCase.generateRounds();
        var match = Match.builder()
                .id(1)
                .player(playerFound)
                .rounds(generatedRounds)
                .build();

       return matchPortOut.save(match);

    }
}
