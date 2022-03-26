package com.br.movies.battle.core.domain;

import lombok.Builder;

import java.util.List;

@Builder
public class Player {

    private Integer id;
    private String name;
    private String login;
    private String password;
    private List<Match> matchList;

}
