/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import CustomerRecord.customerRecord;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Hassan bhai
 */
public class RecordMapper 
{
    ArrayList<customerRecord> getStudents(ResultSet rs) {
        ArrayList<customerRecord> cstmrlist = new ArrayList<>();
        try{
        while (rs.next())
            {
                customerRecord cstlist=new customerRecord();                
                cstlist.customerId=rs.getString("customerId");
                 cstlist.customerName=rs.getString("customerName");
                 cstlist.accountNo=rs.getString("accountNo");
                 cstlist.Address=rs.getString("Address");
                  cstlist.initialBalance=rs.getString("initialBalance");
                cstmrlist.add(cstlist);
            }
        }catch (SQLException e){
            System.out.println(" error in getCustomers"+e.getMessage());
        }
        return cstmrlist;
    }
    
}
