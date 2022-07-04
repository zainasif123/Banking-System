/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dal;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HP
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Bank Management System;trustServerCertificate=true;","sa","ahmed123");
            Statement sm =conn.createStatement();
            ResultSet rs=sm.executeQuery("select * from bnakEmployees");
            while(rs.next()){
            
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            
            }
                    } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
