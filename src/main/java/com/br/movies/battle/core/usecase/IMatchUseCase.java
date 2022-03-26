package com.br.movies.battle.core.usecase;

import com.br.movies.battle.core.domain.Match;
import com.br.movies.battle.core.domain.Player;

public interface IMatchUseCase {

    Match startMatch(Player player);

}
