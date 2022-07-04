/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import java.sql.*;

/**
 *
 * @author Hassan bhai
 */
public class sqlConnection implements Iconnection
{
 private  String servername;
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
           return DriverManager.getConnection(this.servername,this.databaseusername,this.databasepassword);
            
           
           
        } catch (SQLException e) {
            
            System.out.println("error in getconnection()"+e.getMessage());
        } 
        return null;
    }


}
   
    
   
    
    
 
    
    
    

