/**
 * this class is the football team class, it implements the team interface, it has characteristic
 * applying rule of football
 */
package main;

public class FootballTeam implements main.Team {
    String teamName;
    int points;
    String sponsor;
    public FootballTeam(String teamName, String points, String sponsor){
        this.teamName = teamName;
        this.points = Integer.parseInt(points);
        this.sponsor = sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    @Override
    public void updatePoints(String MatchStatus) {
        switch (MatchStatus){
            case "Win":
                points += 3;
            case "Drawn":
                points += 1;
            case "Lose":

        }
    }

    @Override
    public String getTeamName() {
        return teamName;
    }

    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public String getClubType() {
        return "Football";
    }

    @Override
    public String getSponsor() {
        return this.sponsor;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "teamName='" + teamName + '\'' +
                ", points=" + points +
                ", sponsor='" + sponsor + '\'' +
                '}';
    }
}
