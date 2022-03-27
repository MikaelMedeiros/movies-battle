package com.br.movies.battle.adapters.config;

import com.br.movies.battle.Application;
import com.br.movies.battle.core.port.MatchPortOut;
import com.br.movies.battle.core.usecase.IMatchUseCase;
import com.br.movies.battle.core.usecase.IPlayerUseCase;
import com.br.movies.battle.core.usecase.IRoundUseCase;
import com.br.movies.battle.core.usecase.impl.MatchUseCase;
import com.br.movies.battle.core.usecase.impl.PlayerUseCase;
import com.br.movies.battle.core.usecase.impl.RoundUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = { Application.class })
public class BeanConfig {

    @Bean
    IPlayerUseCase playerUseCase() {
        return new PlayerUseCase();
    }

    @Bean
    IRoundUseCase roundUseCase() {
        return new RoundUseCase();
    }

    @Bean
    IMatchUseCase matchUseCase(MatchPortOut matchPortOut, PlayerUseCase playerUseCase, RoundUseCase roundUseCase) {
        return new MatchUseCase(playerUseCase, roundUseCase, matchPortOut);
    }

}
