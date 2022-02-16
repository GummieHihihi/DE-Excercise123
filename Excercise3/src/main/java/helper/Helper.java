/**
 * this class contain all the main logical function of the program
 */
package helper;

import main.Team;
import main.java.duong.TeamFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Helper {
    private static final String COMMA_DELIMITER = ",";
    private TeamFactory teamFactory = new TeamFactory();
    public Helper(){}

    /**
     * this method read the file and return them as a list of <Team>
     * @param filename
     * @return : List<Team>
     */
    public List<Team> readFile(String filename){
        String line = "";

        List<main.Team> listTeam = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null){
                List<String> teaminfo = Arrays.asList(line.split(","));
                listTeam.add(teamFactory.createTeam(teaminfo));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listTeam;
    }

    /**
     * this method update the point of each team base on the result csv file
     * @param fileName -> the result file name
     * @param teams -> List<Team>
     */
    public void updatePoint(String fileName, List<Team> teams){

        String line = "";

        List<List<String>> results = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null){
                List<String> result = Arrays.asList(line.split(","));
                String teamName = result.get(0);
                String matchStatus = result.get(1);
                List<Team> teamsAfterUpdate = teams.stream()
                        .peek(new Consumer<Team>() {
                            @Override
                            public void accept(Team team) {
                                if(team.getTeamName().equals(teamName)){
                                    team.updatePoints(matchStatus);
                                }
                            }
                        }).collect(Collectors.toList());
                System.out.println("***************** point updated *****************");
                System.out.println("result  : " + teamName + " " + matchStatus);
                printOut(teamsAfterUpdate);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * this method print the header of result table
     */
    public static void printHeader(){
        System.out.printf("%-25s|%10s|%20s", "team", "point", "sponsor" + "\n");

    }

    /**
     * this method print out the result table content
     * @param teams List<TEAM>
     */
    public void printOut(List<Team> teams){
        class compareSort implements Comparator<Team>{

            @Override
            public int compare(Team o1, Team o2) {
                if(o1.getPoints()>o2.getPoints()){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        }
        System.out.println(" ================ ");
        List<Team> basketBallTeam = teams.stream().filter(team -> team.getClubType().equals("Basketball"))
                .sorted(new compareSort()).collect(Collectors.toList());
        List<Team> footBallTeam = teams.stream().filter(team -> team.getClubType().equals("Football"))
                .sorted( new compareSort()).collect(Collectors.toList());

        System.out.println("Basketbal Team: ");
        for (Team team:basketBallTeam) {
            System.out.printf("%-25s|%10d|%20s", team.getTeamName(), team.getPoints(), team.getSponsor() + "\n");
        }

        System.out.println("+++++++++++++++++++");
        System.out.println("Football Team :" );
        for (Team team:footBallTeam) {
            System.out.printf("%-25s|%10d|%20s", team.getTeamName(), team.getPoints(), team.getSponsor() + "\n");
        }
    }
}
