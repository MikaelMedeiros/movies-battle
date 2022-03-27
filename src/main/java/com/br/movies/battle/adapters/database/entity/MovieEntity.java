package com.br.movies.battle.adapters.database.entity;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
@Table(name = "TB_MOVIE")
public class MovieEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "RATING")
    private Float rating;

    @Column(name = "VOTES")
    private Integer votes;
}
