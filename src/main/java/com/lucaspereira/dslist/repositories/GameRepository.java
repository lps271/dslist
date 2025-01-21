package com.lucaspereira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucaspereira.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
