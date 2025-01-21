package com.moisesdias.dslist.dto;

import com.moisesdias.dslist.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {
    }
    //Sem utilizar o BeanUtils.copyProperties(entity, this), declarando todos os atributos da classe
    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
