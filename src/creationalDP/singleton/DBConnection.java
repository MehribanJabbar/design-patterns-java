package creationalDP.singleton;

public class DBConnection {
    private static DBConnection dbConnection;
    private static String queryHistory="Query History +\n";

    private DBConnection(){}

    public static DBConnection getDbConnection(){
        if (dbConnection==null) dbConnection=new DBConnection();
        return dbConnection;
    }

    public void addQuery(String query){
        queryHistory += query + "\n";
    }

    public void showQureies(){
        System.out.println(queryHistory);
    }
}
