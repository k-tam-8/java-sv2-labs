package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.List;

public class ChessTournament {
    private List<Team> teams= new ArrayList<>();

    public ChessTournament(){

    }
    public void addPlayersToTeams(List<Player> playersRegistrated){
        for (int i = 0; i < 6; i+=2) {
            Team team= new Team();
            teams.add(team);
        }
    }


}
