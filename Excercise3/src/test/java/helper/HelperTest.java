package helper;

import main.BasketballTeam;
import main.FootballTeam;
import main.Team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class HelperTest {

    /**
     * testing the read file function of the teams.csv file to see if it generate the right result or not
     */
    @org.junit.Test
    public void readFile() {
        Helper helper = new Helper();
        FileUrl url = new FileUrl();
        List<Team> actualTeamList = new ArrayList<>();
        actualTeamList = helper.readFile(url.teamURL);
        List<Team> expectedList = new ArrayList<>();
        List<Team> expectedTeams = Arrays.asList(
                new BasketballTeam("Boston Celtics", "10"),
                new BasketballTeam("Los Angeles Lakers", "8"),
                new FootballTeam("Chelsea", "33", "Happy Foot"),
                new FootballTeam("Liverpool", "45", "Bet Company"),
                new BasketballTeam("Cleveland Cavaliers", "6"),
                new FootballTeam("Manchester United", "37", "Nice Stadium")
        );
        expectedList.addAll(expectedTeams);

        assertTrue(compareList(expectedList, actualTeamList));
        System.out.println("testing reading from teams.csv file successfully");
    }

    /**
     * this function compare 2 list of team, team1 and team 2
     * @param listTeam1
     * @param listTeam2
     * @return true if the listTeam 1 is equal to listTeam 2
     */
    private boolean compareList(List<Team> listTeam1, List<Team> listTeam2){
        if(listTeam1.size() != listTeam2.size()){
            return false;
        }
        for (int i =0; i<listTeam1.size()-1; i++){
            if (!compareTeam(listTeam1.get(i), listTeam2.get(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * this function compare if team 1 has the same information as team 2
     * @param team1
     * @param team2
     * @return true if team 1 is the same to team 2
     */
    private boolean compareTeam(Team team1,Team team2){
        if(team1.getClubType().equals(team2.getClubType()) && team1.getTeamName().equals(team2.getTeamName())
        && team1.getPoints() == team2.getPoints()){
            return true;
        }
        return false;
    }
}