package com.br.movies.battle.adapters.rest.controller;

import com.br.movies.battle.adapters.mapper.MatchMapper;
import com.br.movies.battle.adapters.rest.dto.MatchDTO;
import com.br.movies.battle.core.domain.Match;
import com.br.movies.battle.core.usecase.IMatchUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/matchs")
@RequiredArgsConstructor
public class MatchController {

    private final IMatchUseCase useCase;
    private final MatchMapper mapper;

    @PostMapping("/{continuate}/{idUser}")
    public ResponseEntity<MatchDTO> startMatch(@PathVariable Boolean continuate,
                                               @PathVariable Integer idUser) {

        var startedMatch = useCase.startMatch(idUser);
        var response = mapper.matchDomainToDTO(startedMatch);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
