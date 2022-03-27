package com.br.movies.battle.adapters.database.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_MATCH")
public class MatchEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PLAYER_ID", referencedColumnName = "id")
    private PlayerEntity player;

    @OneToMany(mappedBy = "match")
    private List<RoundEntity> rounds;

}
