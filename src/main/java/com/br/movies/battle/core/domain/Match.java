package com.br.movies.battle.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Builder
@Getter
public class Match {

    private Integer id;
    private List<Round> rounds;
    private Player player;

}
