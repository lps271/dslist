package com.lucaspereira.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucaspereira.dslist.dto.GameDTO;
import com.lucaspereira.dslist.dto.GameMinDTO;
import com.lucaspereira.dslist.entities.Game;
import com.lucaspereira.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long gameId) {
		Game result = gameRepository.findById(gameId).get();
		GameDTO dto = new GameDTO(result);
		System.out.print(dto.getShortDescription());
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll (){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	
}
