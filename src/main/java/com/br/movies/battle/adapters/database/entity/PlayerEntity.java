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

    @OneToOne(mappedBy = "player")
    private MatchEntity match;
}
