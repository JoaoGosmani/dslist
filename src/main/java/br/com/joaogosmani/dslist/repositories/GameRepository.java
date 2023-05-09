package br.com.joaogosmani.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
