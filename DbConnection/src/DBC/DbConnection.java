/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBC;
import java.sql.*;
/**
 *
 * @author ti
 */
public class DbConnection {
    public Connection getDbConnected() throws SQLException{
        Connection conn = null;
        String myDriver = "com.mysql.cj.jdbc.Driver";
        String myUrl = "jdbc:mysql://localhost/practicas";
        try {
            Class.forName(myDriver);
            conn = DriverManager.getConnection(myUrl, "root", "1234");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
        return conn;
    }
}
