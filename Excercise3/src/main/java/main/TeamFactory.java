/**
 * this class took a list of string then transform it into the compatible type of basketball of football team
 */
package main.java.duong;

import java.util.List;

public class TeamFactory {
    /**
     * create the team base on the input list of strings
     * @param teamInfo
     * @return BasketballTeam or FootballTeam
     */
    public main.Team createTeam(List<String> teamInfo){
        main.Team createdTeam = null;
        if(teamInfo.get(0).equals("Basketball")){
            createdTeam = (main.Team) new main.BasketballTeam(teamInfo.get(1).trim(), teamInfo.get(2).trim());
        }
        if(teamInfo.get(0).equals("Football")){
            createdTeam = (main.Team) new main.FootballTeam(teamInfo.get(1).trim(), teamInfo.get(2).trim(), teamInfo.get(3).trim());
        }
        return createdTeam;
    }
}
