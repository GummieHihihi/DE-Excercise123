package duong;

public class BasketballTeam implements duong.Team {
    private String teamname;
    private int points;
    private String sponsor;

    public String getSponsor(){
        return " no sponsor";
    }

    public BasketballTeam(String teamname, String points, String sponsor){
        this.teamname = teamname;
        this.points = Integer.parseInt(points);
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
