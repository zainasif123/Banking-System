/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_system.dal;

/**
 *
 * @author shanii
 */
public class RecordMapper {
    ArrayList<EmployeeDTO> getEmployees(ResultSet rs) {
        ArrayList<EmployeeDTO> emplist = new ArrayList<EmployeeDTO>();
        try{
        while (rs.next())
            {
                EmployeeDTO objEmp=new EmployeeDTO();                
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
