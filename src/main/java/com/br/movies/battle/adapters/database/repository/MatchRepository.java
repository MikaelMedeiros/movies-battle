package com.br.movies.battle.adapters.database.repository;

import com.br.movies.battle.adapters.database.entity.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<MatchEntity, Integer> {
}
