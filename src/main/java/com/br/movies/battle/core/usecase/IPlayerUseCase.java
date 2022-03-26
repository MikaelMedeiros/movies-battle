package com.br.movies.battle.core.usecase;

import com.br.movies.battle.core.domain.Player;

public interface IPlayerUseCase {

    Player findPlayer(Integer id);

}
