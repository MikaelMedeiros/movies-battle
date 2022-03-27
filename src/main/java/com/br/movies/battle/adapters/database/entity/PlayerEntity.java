package com.br.movies.battle.adapters.database.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_PLAYER")
public class PlayerEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SCORE")
    private Integer score;

    @OneToMany
    private MatchEntity match;

    @Column(name = "AUTHENTICATED")
    private Boolean authenticated;
}
