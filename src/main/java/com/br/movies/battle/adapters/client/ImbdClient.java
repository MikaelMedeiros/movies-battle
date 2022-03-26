package com.br.movies.battle.adapters.client;

import com.br.movies.battle.adapters.client.response.ImbdResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="iMDB", url=" http://www.omdbapi.com/?apikey=492a9dc5")
public interface ImbdClient {

    @GetMapping("/s={search}&page=2&type=movie")
    List<ImbdResponse> getMovies(@PathVariable String search);

    @GetMapping("/i={idiMDB}")
    ImbdResponse getMovie(@PathVariable String idiMDB);
}
