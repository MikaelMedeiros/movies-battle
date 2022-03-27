package com.br.movies.battle.adapters.mapper;

import com.br.movies.battle.adapters.database.entity.PlayerEntity;
import com.br.movies.battle.core.domain.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {
    public Player entityListToDomain(PlayerEntity entity) {
        return Player.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }
}
