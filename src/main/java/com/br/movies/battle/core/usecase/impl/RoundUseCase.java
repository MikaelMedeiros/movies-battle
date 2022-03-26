package com.br.movies.battle.core.usecase.impl;

import com.br.movies.battle.core.domain.Movie;
import com.br.movies.battle.core.domain.Round;
import com.br.movies.battle.core.usecase.IRoundUseCase;

import java.util.List;

public class RoundUseCase implements IRoundUseCase {
    @Override
    public List<Round> generateRounds() {
        return
                List.of(
                        Round.builder()
                                .id(1)
                                .movies(
                                        List.of(
                                                new Movie("tt3896198", "Guardians of the Galaxy Vol. 2", 7.6f, 641226),
                                                new Movie("tt3899198", "Inazuma Japan's Final Battle!", 0.0f, 0)
                                        )
                                )
                                .build()
                );

    }
}
