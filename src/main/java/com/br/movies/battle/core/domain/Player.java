package com.br.movies.battle.core.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
public class Player {

    @Getter
    private Integer id;
    @Getter
    private String name;
    private String login;
    private String password;

}
