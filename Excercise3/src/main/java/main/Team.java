/**
 * this interface is the interface of all teams, it contain basketball team and football team.
 */
package main;

public interface Team {

    /**
     * update the point of each team after reading each line in the csv file
     * @param matchStatus: the status of the match
     */
    void updatePoints(String matchStatus);

    /**
     * return the name of the team
     * @return team name
     */
    String getTeamName();

    /**
     * return the point ò the team in the
     * @return point
     */
    int getPoints();

    /**
     * this method return the type of the team
     * @return basketball or football
     */
    String getClubType();

    /**
     * this function return the sponsor of the team
     * @return: sponsor of the team
     */
    String getSponsor();
}
