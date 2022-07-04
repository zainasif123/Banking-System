/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import CustomerRecords.CustomerRecords;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Hassan bhai
 */
public class RecordMapper
{
     ArrayList<CustomerRecords> getCustomerRecords(ResultSet rs) {
        ArrayList<CustomerRecords> customerList = new ArrayList<>();
        try{
        while (rs.next())
            {
                CustomerRecords CstObj=new CustomerRecords();                
                CstObj.customerId=rs.getInt("customerId");
                 CstObj.customerName=rs.getString("customerName");
                 CstObj.accountNo=rs.getInt("accountNo");
                 CstObj.accountType=rs.getString("accountType");
                 CstObj.mobileNUmber=rs.getString("mobileNumber");
                 CstObj.Address=rs.getString("Address");
                customerList.add(CstObj);
            }
        }catch (SQLException e){
            System.out.println(" error in getCustomers"+e.getMessage());
        }
        return customerList;
    }
    
}
