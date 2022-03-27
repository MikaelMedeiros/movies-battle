package com.br.movies.battle.adapters.config;

import com.br.movies.battle.core.domain.Movie;
import com.br.movies.battle.core.port.MatchPortOut;
import com.br.movies.battle.core.port.MoviePortOut;
import com.br.movies.battle.core.port.RoundPortOut;
import com.br.movies.battle.core.usecase.IMatchUseCase;
import com.br.movies.battle.core.usecase.IMovieUseCase;
import com.br.movies.battle.core.usecase.IPlayerUseCase;
import com.br.movies.battle.core.usecase.IRoundUseCase;
import com.br.movies.battle.core.usecase.impl.MatchUseCase;
import com.br.movies.battle.core.usecase.impl.MovieUseCase;
import com.br.movies.battle.core.usecase.impl.PlayerUseCase;
import com.br.movies.battle.core.usecase.impl.RoundUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public IPlayerUseCase playerUseCase() {
        return new PlayerUseCase();
    }

    @Bean
    public IMovieUseCase movieUseCase(MoviePortOut moviePortOut) {
        return new MovieUseCase(moviePortOut);
    }

    @Bean
    public IRoundUseCase roundUseCase(RoundPortOut roundPortOut,  IMovieUseCase movieUseCase) {
        return new RoundUseCase(roundPortOut, movieUseCase);
    }

    @Bean
    public IMatchUseCase matchUseCase(MatchPortOut matchPortOut, IPlayerUseCase playerUseCase, IRoundUseCase roundUseCase) {
        return new MatchUseCase(playerUseCase, roundUseCase, matchPortOut);
    }

}
