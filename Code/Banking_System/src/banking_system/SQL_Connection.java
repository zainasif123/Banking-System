/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking_system;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ARC
 */
public class SQL_Connection {
    public static void main(String[] args) {
        String url="jdbc:sqlserver://sqlsrv\\sqlexpress;databaseName=Banking Management System";
        String user="sa";
        String password="zain1111";
        
     try{
           Connection connection=(Connection) DriverManager.getConnection(url, user, password);
           System.out.println("Connected to Microsoft SQL server ");
     }
     catch(SQLException e){
         System.out.println("OOPs There is an error");
     }
        
    }
}
