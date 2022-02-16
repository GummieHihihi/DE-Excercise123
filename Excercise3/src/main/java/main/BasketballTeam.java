/**
 * this class is the basketball team class, it implements the Team interface, this class using the rule
 * of basketball
 */
package main;

public class BasketballTeam implements main.Team {
    private String teamname;
    private int points;
    private String sponsor;

    public String getSponsor(){
        return this.sponsor;
    }

    public BasketballTeam(String teamname, String points){
        this.teamname = teamname;
        this.points = Integer.parseInt(points);
        this.sponsor = "no information";
    }
    @Override
    public void updatePoints(String matchStatus) {
        if(matchStatus.equals("Win")) points += 2;
    }

    @Override
    public String getTeamName() {
        return teamname;
    }

    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public String getClubType() {
        return "Basketball";
    }

    @Override
    public String toString() {
        return "BasketballTeam{" +
                "teamname='" + teamname + '\'' +
                ", points=" + points +
                '}';
    }
}
