package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    private static Connection cnx;
    private static String url="jdbc:mysql://localhost:3306/esprit";
    private static String login="root";
    private static String pwd="";
    private static DataSource instance;

    private DataSource() {
        try {
            cnx = DriverManager.getConnection(url, login, pwd);
            System.out.println("succes");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DataSource getInstance(){
        if(instance==null)
            instance=new DataSource();
        return instance;
    }

    public static Connection getCnx() {
        return cnx;
    }
}
