/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dal.DALManager;
import dal.RecordsMapper;

/**
 *
 * @author HP
 */
public class BMSFactory {
     static DALManager getInstanceOfDALManager() {
        return new DALManager(new RecordsMapper());
    }

    public static BMSController getInstanceOfSMSController() {
        return new BMSController();
    }
    
}
