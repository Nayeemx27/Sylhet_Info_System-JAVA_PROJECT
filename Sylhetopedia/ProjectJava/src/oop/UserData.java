package oop;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Aftar Ahmad Sami
 */
public class UserData {
    public Connection connection;
    public Connection getConnection() {
        String dbName = "w4iVYtLS82";
        String userName = "w4iVYtLS82";
        String password = "MFzQSDcmFE";

try{
Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
connection = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/"+dbName,userName,password);
} catch(Exception ex){
JOptionPane.showMessageDialog(null, "Connect to Internet....", "Connection Failed",2);
}
return connection;
}
}

