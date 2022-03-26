package com.br.movies.battle.core.usecase.impl;

import com.br.movies.battle.core.domain.Player;
import com.br.movies.battle.core.usecase.IPlayerUseCase;

public class PlayerUseCase implements IPlayerUseCase {
    @Override
    public Player findPlayer(Integer id) {
        return Player.builder()
                .id(1)
                .build();
    }
}
