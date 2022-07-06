/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hassan bhai
 */
public class sqlConnection implements IConnection
{
    private  String servername;
     private  String databasename;
     private  String databaseusername;
      private  String databasepassword;

    public sqlConnection(String servername, String dbusername,String dbpassword) {
        
        this.servername=servername;
        this.databaseusername=dbusername;
        this.databasepassword=dbpassword;
    }

  
    @Override
    public Connection getConnection() {
        try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
           return DriverManager.getConnection(this.servername,this.databaseusername,this.databasepassword);
         
        } catch (SQLException e) 
        {
            System.out.println("error in getconnection()"+e.getMessage());

        }
        return null;
    }
     
      
      
      
    
}
