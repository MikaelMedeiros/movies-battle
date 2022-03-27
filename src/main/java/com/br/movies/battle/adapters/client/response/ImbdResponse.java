package com.br.movies.battle.adapters.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ImbdResponse {

    private String imdbID;

    @JsonProperty("Title")
    private String title;

    private String imdbRating;

    private String imdbVotes;

}
