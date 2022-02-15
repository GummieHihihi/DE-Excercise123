package helper;

public class FileUrl {
    public final String teamURL = getClass().getResource("/teams.csv").getFile();
    public final String resultURL = getClass().getResource("/results.csv").getFile();
    public FileUrl(){}
}
