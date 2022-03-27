package com.br.movies.battle.adapters.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MatchDTO {

    private Integer idPlayer;
    private Boolean continuate;

    private String welcome;
    private String question;

    private String next;

    public void setNext() {
        this.next = "/api/v1/rounds/"+getLastRound();
    }

    private List<RoundDTO> rounds;

    private int getLastRound() {
        if(Objects.nonNull(this.rounds))
            return this.rounds.indexOf(this.rounds.size()-1);

        return 1;
    }

}
