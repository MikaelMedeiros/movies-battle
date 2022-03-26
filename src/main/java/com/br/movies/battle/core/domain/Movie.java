package com.br.movies.battle.core.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Movie {

    private String id;
    private String title;
    private Float rating;
    private Integer votes;

    public Float getScore() {
        return rating * votes;
    }

}
