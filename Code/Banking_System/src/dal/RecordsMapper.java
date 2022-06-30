/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.dto.CustomerDTO;

/**
 *
 * @author HP
 */
public class RecordsMapper
{
  ArrayList<CustomerDTO> getEmployees(ResultSet rs) {
        ArrayList<CustomerDTO> emplist = new ArrayList<CustomerDTO>();
        try{
        while (rs.next())
            {
                CustomerDTO objEmp=new CustomerDTO();                
                objEmp.Id=rs.getString(1);
                objEmp.Name=rs.getString(3) + " "+rs.getString(2);
                objEmp.Address=rs.getString(8);                  
                emplist.add(objEmp);
            }
        }catch (Exception e){
        }
        return emplist;
    }   
}
