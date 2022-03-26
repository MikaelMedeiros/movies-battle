package com.br.movies.battle.core.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    void shouldReturnMovieScore() {
        var movie = new Movie("idTest", "Movie Teste", 7.6f, 641226);
        var score = movie.getScore();

        Assertions.assertEquals(4873317.6f, score);
    }

}
