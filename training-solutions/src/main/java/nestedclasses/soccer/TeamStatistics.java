package nestedclasses.soccer;

import java.util.Objects;

public class TeamStatistics {
    private String teamName;
    private Attributes attributes;

    public String getTeamName() {
        return teamName;
    }

    public void played(int plusGoalsFor, int plusGoalsAgainst) {
        attributes.played++;
        if (plusGoalsAgainst > plusGoalsFor) {
            attributes.lost++;
        } else if (plusGoalsAgainst == plusGoalsFor) {
            attributes.tied++;
            attributes.points++;
        } else {
            attributes.won++;
            attributes.points += 3;
        }
        attributes.goalsAgainst += plusGoalsAgainst;
        attributes.goalsFor += plusGoalsFor;
        attributes.played++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamStatistics that = (TeamStatistics) o;
        return Objects.equals(teamName, that.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName);
    }

    public class Attributes {
        private int played;
        private int won;
        private int tied;
        private int lost;
        private int goalsFor;
        private int goalsAgainst;
        private int points;

        public int getPlayed() {
            return played;
        }

        public int getWon() {
            return won;
        }

        public int getTied() {
            return tied;
        }

        public int getLost() {
            return lost;
        }

        public int getGoalsFor() {
            return goalsFor;
        }

        public int getGoalsAgainst() {
            return goalsAgainst;
        }

        public int getPoints() {
            return points;
        }
    }
}
