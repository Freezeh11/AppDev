package com.appdev.teamname.espelitag6.Service;

import com.appdev.teamname.espelitag6.Entity.Game;
import com.appdev.teamname.espelitag6.Repository.GameRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game getGameById(Long id) {
        return gameRepository.findById(id).orElse(null);
    }

    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    public Game updateGame(Long id, Game updatedGame) {
        Game game = getGameById(id);
        if (game != null) {
            game.setBadgeName(updatedGame.getBadgeName());
            game.setGoalDescription(updatedGame.getGoalDescription());
            game.setGoalTarget(updatedGame.getGoalTarget());
            game.setProgressRate(updatedGame.getProgressRate());
            game.setAchievementStatus(updatedGame.getAchievementStatus());
            game.setDateEarned(updatedGame.getDateEarned());
            return gameRepository.save(game);
        }
        return null;
    }

    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }
}
