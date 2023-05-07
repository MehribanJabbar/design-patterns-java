package creationalDP.singleton;

public class Main {
    public static void main(String[] args) {
        var dbConnection=DBConnection.getDbConnection();
        dbConnection.addQuery("First Query");
        dbConnection.addQuery("Second Query");
        dbConnection.addQuery("Third Query");
        dbConnection.showQureies();
    }
}
