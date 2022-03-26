package com.br.movies.battle.core.usecase.impl;

import com.br.movies.battle.core.domain.Match;
import com.br.movies.battle.core.domain.Movie;
import com.br.movies.battle.core.domain.Player;
import com.br.movies.battle.core.domain.Round;
import com.br.movies.battle.core.usecase.IMatchUseCase;
import com.br.movies.battle.core.usecase.IPlayerUseCase;
import com.br.movies.battle.core.usecase.IRoundUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


@ExtendWith(MockitoExtension.class)
class MatchUseCaseTest {

    @Mock
    private IRoundUseCase roundUseCase;

    @Mock
    private IPlayerUseCase playerUseCase;

    @InjectMocks
    private MatchUseCase useCase;

    @Test
    void shouldStartMatch() {

        var player = Player.builder()
                .id(1)
                .name("Alberto")
                .build();

        var matchStarted = useCase.startMatch(player);

        Assertions.assertNotNull(matchStarted);
    }

    public Match getMockMatch(Integer id) {
        return  Match.builder()
                .id(id)
                .rounds(
                        List.of(
                                Round.builder()
                                        .id(id)
                                        .movies(generateTwoMovies())
                                        .build()
                        )
                )
                .player(
                        Player.builder()
                                .id(id)
                                .name("Teste")
                                .build()
                )
                .build();
    }

    public List<Movie> generateTwoMovies() {
        return List.of(
                new Movie("tt3896198", "Guardians of the Galaxy Vol. 2", 7.6f, 641226),
                new Movie("tt3899198", "Inazuma Japan's Final Battle!", 0.0f, 0)
        );
    }

}