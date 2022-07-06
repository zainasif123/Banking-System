/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import CustomerRecord.customerRecord;
import DAL.DBManager;
import java.util.ArrayList;

/**
 *
 * @author Hassan bhai
 */
public class customerController 
{
    DBManager dm;
   public customerController(){

        dm=Ccontroller.getInstanceOfDBManager();
    }

    public ArrayList<customerRecord> viewCustomers() {
        return dm.getlist();
    }
     public void forquery(String query){
     
     dm.getquery(query);
     
     }

 
}
