package com.br.movies.battle.core.usecase.impl;

import com.br.movies.battle.core.domain.Match;
import com.br.movies.battle.core.domain.Movie;
import com.br.movies.battle.core.domain.Player;
import com.br.movies.battle.core.domain.Round;
import com.br.movies.battle.core.usecase.IPlayerUseCase;
import com.br.movies.battle.core.usecase.IRoundUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static java.util.List.of;
import static org.mockito.Mockito.when;


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
        var matchStarted = useCase.startMatch(1);

        Assertions.assertNotNull(matchStarted);
    }

    @Test
    void shouldStartMatchWithPlayer() {
        when(playerUseCase.findPlayer(1)).thenReturn(generatePlayer());

        var matchStarted = useCase.startMatch(1);
        Assertions.assertNotNull(matchStarted.getPlayer());
    }

    @Test
    void shouldStartMatchWithRounds() {
        when(roundUseCase.generateRounds()).thenReturn(generateRounds());

        var matchStarted = useCase.startMatch(1);
        Assertions.assertNotNull(matchStarted.getRounds());
    }

    public Match getMockMatch(Integer id) {
        return  Match.builder()
                .id(id)
                .rounds(
                        generateRounds()
                )
                .player(
                        generatePlayer()
                )
                .build();
    }

    public List<Round> generateRounds() {
        return of (
                Round.builder()
                        .id(1)
                        .movies(generateTwoMovies())
                        .build()
        );
    }

    public Player generatePlayer() {
        return Player.builder()
                .id(1)
                .name("Alberto")
                .login("anselmo.lesmo")
                .build();
    }

    public List<Movie> generateTwoMovies() {
        return of (
                new Movie("tt3896198", "Guardians of the Galaxy Vol. 2", 7.6f, 641226),
                new Movie("tt3899198", "Inazuma Japan's Final Battle!", 0.0f, 0)
        );
    }

}