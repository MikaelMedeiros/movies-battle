package com.br.movies.battle.core.port;

import com.br.movies.battle.core.domain.Match;

public interface MatchPortOut {

    Match save(Match match);

}
