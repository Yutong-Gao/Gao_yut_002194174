/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gyt
 */
public class CarsHistory {
    private ArrayList<Cars> history;
    public CarsHistory(){
        this.history = new ArrayList<Cars>();
        Cars car1 = new Cars();
        car1.setAvaliable(true);
        car1.setCity("Boston");
        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1;
        try {
            date1 = ft1.parse("2022-07-13");
            car1.setMainCertificate(date1);
        } catch (ParseException ex) {
            Logger.getLogger(CarsHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        car1.setManufacturer("BMW");
        car1.setModelNum("B8");
        car1.setSeats(3);
        car1.setSerialNum("22SE43");
        car1.setYear(1976);
        history.add(car1);
        Cars car2 = new Cars();
        car2.setAvaliable(true);
        car2.setCity("Boston");
        SimpleDateFormat ft2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date2;
        try {
            date2 = ft2.parse("2022-04-13");
            car2.setMainCertificate(date2);
        } catch (ParseException ex) {
            Logger.getLogger(CarsHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        car2.setManufacturer("BMW");
        car2.setModelNum("B8");
        car2.setSeats(5);
        car2.setSerialNum("433S20");
        car2.setYear(1976);
        history.add(car2);
        Cars car3 = new Cars();
        car3.setAvaliable(false);
        car3.setCity("New York");
        SimpleDateFormat ft3 = new SimpleDateFormat("yyyy-MM-dd");
        Date date3;
        try {
            date3 = ft3.parse("2021-06-13");
            car3.setMainCertificate(date3);
        } catch (ParseException ex) {
            Logger.getLogger(CarsHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        car3.setManufacturer("TOYOA");
        car3.setModelNum("S3");
        car3.setSeats(7);
        car3.setSerialNum("90N4");
        car3.setYear(1986);
        history.add(car3);
        
    }

    public ArrayList<Cars> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Cars> history) {
        this.history = history;
    }
    
    public Cars addNewCar(){
        Cars newCar = new Cars();
        history.add(newCar);
        return newCar;
    }
    
    public void deleteCars(Cars car){
        history.remove(car);
    }
    
}
