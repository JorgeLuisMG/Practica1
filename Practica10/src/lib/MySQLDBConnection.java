/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;
import java.sql.*;
/**
 *
 * @author ti
 */
public class MySQLDBConnection {
    public static Connection main(String[] args) throws ClassNotFoundException, SQLException {
      // create our mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://192.168.0.134/test";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "usuario", "password");
      return conn;
  }
}
