package com.br.movies.battle.adapters.rest.dto;

import lombok.Builder;

import java.util.List;

@Builder
public class RoundDTO {

    private List<MovieDTO> movies;
    private Boolean correct;

}
