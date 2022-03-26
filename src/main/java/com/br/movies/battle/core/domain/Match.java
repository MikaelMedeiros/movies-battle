package com.br.movies.battle.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.List;

@AllArgsConstructor
@Builder
public class Match {

    private Integer id;
    private List<Round> rounds;
    private Player player;

}
