package nestedclasses.soccer;

import defaultconstructor.chess.Team;

import java.util.ArrayList;
import java.util.List;

public class Championship {

    private List<TeamStatistics> leagueTable = new ArrayList<>();

    public List<TeamStatistics> getLeagueTable() {
        return new ArrayList<>(leagueTable);
    }

    public void addGame(GameResult result) {

    }

    public static class GameResult {
        private String teamGuest;
        private int goalHome;
        private int goalGuest;

        public GameResult(String teamGuest, int goalHome, int goalGuest) {
            this.teamGuest = teamGuest;
            this.goalHome = goalHome;
            this.goalGuest = goalGuest;
        }
    }
}
