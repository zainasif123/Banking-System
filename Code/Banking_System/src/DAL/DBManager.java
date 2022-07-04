/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import CustomerRecords.CustomerRecords;
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
     Iconnection connect;
    
   private String Query;
   
     
    public DBManager(RecordMapper mapp){
        connect=new sqlConnection("jdbc:sqlserver://;databaseName=Bank Management System;trustServerCertificate=true;" ,"sa","25272634");
       this.mapp=mapp;
  reader=new DBReader();
    }
            
   public void getquery(String Query){
   
   this.Query=Query;
   
   }
public ArrayList<CustomerRecords> getlist(){

Connection dbconn =connect.getConnection();
ResultSet rs =reader.getRecord(Query,dbconn);

return mapp.getCustomerRecords(rs);
   
}
}
