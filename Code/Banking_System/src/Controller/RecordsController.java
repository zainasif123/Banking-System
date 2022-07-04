/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import CustomerRecords.CustomerRecords;
import DAL.DBManager;
import java.util.ArrayList;

/**
 *
 * @author Hassan bhai
 */
public class RecordsController 
{
     DBManager dm;
   public RecordsController(){

        dm=CustomerController.getInstanceOfDBManager();
    }

    public ArrayList<CustomerRecords> viewstudents() {
        return dm.getlist();
    }
     public void forquery(String query){
     
     dm.getquery(query);
    
}
}
