/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.dto.CustomerDTO;

/**
 *
 * @author HP
 */
public class DALManager {
     IConnection objConnection;
    DBReader objReader;
    RecordsMapper objMapper;

    public DALManager(RecordsMapper mapper){
    objConnection = (IConnection) new SQLConnection("HP","Bank Management System", "sa","ahmed123");
    objReader = new DBReader();
    this.objMapper=mapper;
    }
    public ArrayList<CustomerDTO> getCustomerList() {
                
        Connection  dbConnection = objConnection.getConnection();
        ResultSet rs = objReader.getRecords("Select * from Employees", dbConnection);
        return objMapper.getEmployees(rs);
        
    }  
    
}
