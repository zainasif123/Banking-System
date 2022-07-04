/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class SQLConnection {

     private String serverName;
    private String dbName;
    private String dbUserName;
    private String dbUserPassword;
    
    SQLConnection(String sName, String dbName, String userId, String userPass) {
        this.serverName = sName;
        this.dbName = dbName;
        this.dbUserName = userId;
        this.dbUserPassword = userPass;
    }

    

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:sqlserver://;trustServerCertificate=true;"
                    + ""+this.serverName+";databaseName="+this.dbName, this.dbUserName,this.dbUserPassword);
        }
        catch (Exception e) {
            System.out.println("Error Trace in getConnection() : " + e.getMessage());
        }
        return null;
    }
}
