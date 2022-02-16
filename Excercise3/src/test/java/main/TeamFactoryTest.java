/**
 * testing class for the Team Factory
 */
package main;

import main.java.duong.TeamFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TeamFactoryTest {
    /**
     * testing the creat Team method to see if the created team is the right one or not
     */
    @org.junit.Test
    public void createTeam() {
        Team actualResult = new BasketballTeam("Boston Celtics", "10");
        List<String> expectedInput = new ArrayList<>();
        expectedInput.add("Basketball");
        expectedInput.add("Boston Celtics");
        expectedInput.add("10");

        TeamFactory teamFactory = new TeamFactory();
        BasketballTeam expectedResult = (BasketballTeam) teamFactory.createTeam(expectedInput);
        assertTrue(compare(expectedResult, (BasketballTeam) actualResult));
        System.out.println("test successfully");

    }

    /**
     * compare if baseketball team A is euqal to team B or not
     * @param A
     * @param B
     * @return true if team A has the same content as team B
     */
    private boolean compare(BasketballTeam A, BasketballTeam B){
        if(A.getTeamName().equals(B.getTeamName()) && A.getPoints() == B.getPoints()){
            return true;
        }
        return false;
    }
}