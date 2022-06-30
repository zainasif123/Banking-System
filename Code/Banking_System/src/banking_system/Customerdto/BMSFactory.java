/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_system.Customerdto;

import banking_system.dal.DALManager;

/**
 *
 * @author shanii
 */
public class BMSFactory {
    
    static DALManager getInstanceOfDALManager() {
        return new DALManager(new RecordsMapper());
    }

    public static BMSController getInstanceOfSMSController() {
        return new BMSController();
    }

    static DALManager getInstanceOfDALManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
