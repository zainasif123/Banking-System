/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hassan bhai
 */
class DBReader 
{
    private String sqlQuery;
private Connection connect;

 
    

   ResultSet getRecord(String query,Connection conn) {
      
      
       try {
           Statement sm =conn.createStatement();
         
           
          return (ResultSet) sm.executeQuery(query);
       } catch (SQLException e) {
           
           System.out.println("error in getrecord()"+e.getMessage());
       }
       
       
       return null;
       
      
}
}
