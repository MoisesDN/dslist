package com.moisesdias.dslist.services;

import com.moisesdias.dslist.dto.GameListDTO;
import com.moisesdias.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        var result = gameListRepository.findAll();
        /*
        List<GameList> result = result.stream().map(x -> new GameListDTO(x)).toList();
        return result.stream().map(x -> new GameListDTO(x)).toList();
        */
        return result.stream().map(GameListDTO::new).toList();
    }
}
