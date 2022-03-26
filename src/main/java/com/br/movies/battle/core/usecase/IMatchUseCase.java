package com.br.movies.battle.core.usecase;

import com.br.movies.battle.core.domain.Match;

public interface IMatchUseCase {

    Match startMatch(Integer idPlayer);

}
