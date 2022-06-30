/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_system.Customerdto;

import banking_system.dal.DALManager;
import java.util.ArrayList;

/**
 *
 * @author shanii
 */
class BMSController {
      DALManager objDAL;
    public BMSController(){
    objDAL = BMSFactory.getInstanceOfDALManager();
    }

    public ArrayList<banking_system.dal.Customerdto> viewCustomer() {
        return objDAL.getCustomerList();
}
}
