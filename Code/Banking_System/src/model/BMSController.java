/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dal.DALManager;
import java.util.ArrayList;
import model.dto.CustomerDTO;

/**
 *
 * @author HP
 */
public class BMSController {
    DALManager objDAL;
    public BMSController(){
    objDAL = BMSFactory.getInstanceOfDALManager();
    }

    public ArrayList<CustomerDTO> viewCustomers() 
    {
        return objDAL.getCustomerList();
    }
    
}
