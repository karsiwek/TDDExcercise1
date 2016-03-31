package pl.karolsiwek.bowling;

import java.util.*;

public class BowlingGame {

    private List<Player> players = new ArrayList<Player>();
    private Integer currentPlayerId = 0;

    public BowlingGame(List<String> playersNames) {
        if (playersNames == null || playersNames.isEmpty()) {
            throw new IllegalArgumentException();
        }

        for (String player : playersNames) {
            players.add(new Player(player));
        }
    }

    public void shot(Integer result) {
        players.get(currentPlayerId).shot(result);

        if(players.get(currentPlayerId).isRoundFinished()){
            currentPlayerId = (currentPlayerId + 1) % players.size();
            players.get(currentPlayerId).newRound();
        }

    }

    public Map<String, Integer> getScores() {
        Map<String, Integer> scores = new HashMap<String, Integer>();
        for(Player player : players){
            scores.put(player.getName(), player.getScore());
        }
        return scores;
    }

    public String whoseTurn() {
        return players.get(currentPlayerId).getName();
    }

    public Boolean isFinished() {
        return null;
    }

    public String getWinner() {
        return null;
    }
}
