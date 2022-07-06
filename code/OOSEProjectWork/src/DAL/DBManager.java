/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import CustomerRecord.customerRecord;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Hassan bhai
 */
public class DBManager
{
    DBReader reader;
    RecordMapper mapp;
     IConnection connect;
    
   private String Query;
   
     
    public DBManager(RecordMapper mapp){
        connect=new sqlConnection("jdbc:sqlserver://localhost:1433;databaseName=Bank Management System;trustServerCertificate=true;","sa","25272634");
       this.mapp=mapp;
  reader=new DBReader();
    }
            
   public void getquery(String Query){
   
   this.Query=Query;
   
   }
public ArrayList<customerRecord> getlist(){

Connection dbconn =connect.getConnection();
ResultSet rs =reader.getRecord(Query,dbconn);

return mapp.getStudents(rs);
}
}
