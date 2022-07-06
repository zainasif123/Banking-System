/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAL.DBManager;
import DAL.RecordMapper;

/**
 *
 * @author Hassan bhai
 */
public class Ccontroller
{
   static DBManager getInstanceOfDBManager() {
        return new DBManager(new RecordMapper());
    }
     public static customerController getInstanceOfcustomerController()
     {
        return new customerController();
    }   
}
