package helper;

public class FileUrl {
    public final String teamURL = getClass().getResource("../resources/teams.csv").toString();
    public final String resultURL = getClass().getResource("../resources/results.csv").toString();
    public FileUrl(){}
}
