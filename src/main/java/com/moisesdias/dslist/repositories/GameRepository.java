package com.moisesdias.dslist.repositories;


import com.moisesdias.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
