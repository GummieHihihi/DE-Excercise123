package main.java.duong;

import java.util.List;

public class TeamFactory {
    public  TeamFactory(){}
    public duong.Team createTeam(List<String> teamInfo){
        duong.Team createdTeam = null;
        if(teamInfo.get(0).equals("Basketball")){
            createdTeam = (duong.Team) new duong.BasketballTeam(teamInfo.get(1), teamInfo.get(2), null);
        }
        if(teamInfo.get(0).equals("Football")){
            createdTeam = (duong.Team) new duong.FootballTeam(teamInfo.get(1), teamInfo.get(2), teamInfo.get(3));
        }
        return createdTeam;
    }
}
