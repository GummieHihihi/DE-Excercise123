package main;

import helper.FileUrl;
import helper.Helper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        List<main.Team> teamList = new ArrayList<>();
        FileUrl url = new FileUrl();
        //generating list of teams
        teamList = helper.readFile(url.teamURL);
        //print out result header
        Helper.printHeader();
        //printout the table before updating any points
        helper.printOut(teamList);
        //updating points base on the result file
        helper.updatePoint(url.resultURL, teamList);

    }
}
