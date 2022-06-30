/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_system.dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author shanii
 */
public class DALManager {
    
    IConnection objConnection;
    DBReader objReader;
    RecordsMapper objMapper;

    public DALManager(RecordsMapper mapper){
    objConnection = new SQLConnection("Abbas-PC","customer", "sa","922633ga");
    objReader = new DBReader();
    this.objMapper=mapper;
    }

    public DALManager(banking_system.Customerdto.RecordsMapper recordsMapper) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ArrayList<CustomerDTO> getCustomerList() {
                
        Connection  dbConnection = objConnection.getConnection();
        ResultSet rs = objReader.getRecords("Select * from Employees", dbConnection);
        return objMapper.getCustomer(rs);
        
    }  
    
}
