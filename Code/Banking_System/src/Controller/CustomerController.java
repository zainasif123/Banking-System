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
public class CustomerController 
{
      static DBManager getInstanceOfDatabaseManager() {
        return new DBManager(new RecordMapper());
    }
     public static RecordsController getInstanceOfAttendanceController()
     {
        return new RecordsController();
    }

    static DBManager getInstanceOfDBManager() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
