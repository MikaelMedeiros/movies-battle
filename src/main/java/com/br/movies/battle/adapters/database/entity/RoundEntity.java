package com.br.movies.battle.adapters.database.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_ROUND")
public class RoundEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "match_id", nullable = false)
    private MatchEntity match;


}
