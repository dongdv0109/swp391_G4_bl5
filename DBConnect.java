package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static Connection connection=null;
    public static Connection getConnection(){
        //String connectionUrl = "jdb
        // c:sqlserver://127.0.0.1;databaseName=db_study;user=user_study;password=study123;encrypt=false;"; Use for SQL Server less than 2017
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=SanitationEquipment;encrypt=true;trustServerCertificate=true;";
        String user = "sa";
        String pass = "123";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection= DriverManager.getConnection(connectionUrl, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return connection;
    }
    // Hello and smaile

}
