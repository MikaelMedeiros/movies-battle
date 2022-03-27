package com.br.movies.battle.adapters.database.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "TB_ROUND")
public class RoundEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private List<MovieEntity> movies;

    @Column(name = "CORRECT")
    private Boolean correct;

    @Column(name = "FINISHED")
    private Boolean finished;

}
