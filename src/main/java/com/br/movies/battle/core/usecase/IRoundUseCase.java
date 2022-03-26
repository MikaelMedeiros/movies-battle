package com.br.movies.battle.core.usecase;

import com.br.movies.battle.core.domain.Round;

import java.util.List;

public interface IRoundUseCase {

    List<Round> generateRounds();

}
