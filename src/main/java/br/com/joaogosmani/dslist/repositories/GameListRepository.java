package br.com.joaogosmani.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
