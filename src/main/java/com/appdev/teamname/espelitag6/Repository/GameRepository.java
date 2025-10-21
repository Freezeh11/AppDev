package com.appdev.teamname.espelitag6.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.appdev.teamname.espelitag6.Entity.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}

