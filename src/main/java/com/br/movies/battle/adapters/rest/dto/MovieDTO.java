package com.br.movies.battle.adapters.rest.dto;

import lombok.Builder;

@Builder
public class MovieDTO {

    private final String url = "/round/next/{idMovie}";

    private String name;
    private String select;

    public String setSelect(Integer idMovie) {
        return url.replace("{idMovie}", idMovie.toString());
    }
}
