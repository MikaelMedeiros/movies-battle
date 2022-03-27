package com.br.movies.battle.core.domain;

import com.br.movies.battle.core.exeption.MatchException;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Builder
public class Round {

    private Integer id;

    @Getter
    private List<Movie> movies;

    private final List<String> words = List.of("Batman", "Avenger", "Banana",  "Alice", "Iron", "Car", "Guardians");


    /*
    1 - Criar lista de palavras chaves
    2 - pegar palavra aleatoriamente findAny
    3 - buscar filmes pela palavra chave
    4 - Escolher um
    5 - Adicionar na lista de filmes
    6 - repetir passo 2, 3 e 4
    7 - Verificar se o filme não é igual ao primeiro, se for igual buscar outro, (do while)
    8 - Se for diferente, adicionar na lista
    9 -
    */

    public String getRandomWord() {
        return words.stream().findAny().get();
    }

    public void addToMovieList(Movie movie) {
        if(Objects.isNull(this.movies))
            this.movies = new ArrayList<>();

        if(movieAlreadyExists(movie.getId()))
            throw new MatchException("movie exists");

        this.movies.add(movie);
    }

    private boolean movieAlreadyExists(String id) {
        return this.movies.stream().anyMatch(movie -> movie.getId().equals(id));
    }


}
