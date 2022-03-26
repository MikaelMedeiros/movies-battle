package com.br.movies.battle.core.usecase.impl;

import com.br.movies.battle.core.domain.Match;
import com.br.movies.battle.core.domain.Player;
import com.br.movies.battle.core.usecase.IMatchUseCase;
import com.br.movies.battle.core.usecase.IPlayerUseCase;
import com.br.movies.battle.core.usecase.IRoundUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MatchUseCase implements IMatchUseCase {

    private final IPlayerUseCase playerUseCase;
    private final IRoundUseCase roundUseCase;

    @Override
    public Match startMatch(Player player) {
        return Match.builder()
                .id(1)
                .build();
    }
}
