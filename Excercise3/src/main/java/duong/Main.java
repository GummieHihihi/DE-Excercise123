package duong;

import helper.FileUrl;
import helper.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        List<duong.Team> teamList = new ArrayList<>();
        FileUrl url = new FileUrl();
        teamList = helper.readFile(url.teamURL);
        Helper.printHeader();
        helper.printOut(teamList);

        helper.updatePoint(url.resultURL, teamList);

    }
}
