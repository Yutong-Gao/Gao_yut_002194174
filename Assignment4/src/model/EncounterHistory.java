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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gyt
 */
public class EncounterHistory {
    private List<Encounter> encounterList;

    public List<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(List<Encounter> encounterList) {
        this.encounterList = encounterList;
    }

    public EncounterHistory() {
        this.encounterList = new ArrayList<>();
        City city = new City();
        city.setCityName("Boston");
        
        Community com1 = new Community();
        com1.setCityName("Boston");
        com1.setComName("Community1");
        
        Community com2 = new Community();
        com2.setCityName("Boston");
        com2.setComName("Community2");
        
        House house1 = new House();
        house1.setHouseid(1);
        house1.setCommunity(com1);
        House house2 = new House();
        house2.setHouseid(2);
        house2.setCommunity(com1);
        House house3 = new House();
        house3.setHouseid(1);
        house3.setCommunity(com2);
        House house4 = new House();
        house4.setHouseid(2);
        house4.setCommunity(com2);
        
        PatientDirectory directory = new PatientDirectory();
        
        Patient patient1 = new Patient();
        patient1.setAge(30);
        patient1.setName("Mike");
        patient1.setSSN(913827481);
        patient1.setDoctorName("John");
        patient1.setHouse(house1);
        
        Encounter encounter1 = new Encounter();
        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1;
        try {
            date1 = ft1.parse("2021-10-23");
            encounter1.setEncounterDate(date1);
        } catch (ParseException ex) {
            Logger.getLogger(PatientDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        encounter1.setPatient(patient1);
        encounter1.setSystolic(115);
        encounter1.setDiastolic(75);
        
        Encounter encounter2 = new Encounter();
        Date date2;
        try {
            date2 = ft1.parse("2021-10-16");
            encounter2.setEncounterDate(date2);
        } catch (ParseException ex) {
            Logger.getLogger(PatientDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        encounter2.setPatient(patient1);
        encounter2.setSystolic(114);
        encounter2.setDiastolic(76);
        
        
        directory.addPatient(patient1);
        
        Patient patient2 = new Patient();
        patient2.setAge(65);
        patient2.setName("Andy");
        patient2.setSSN(812347213);
        patient2.setDoctorName("John");
        patient2.setHouse(house2);
        
        Encounter encounter3 = new Encounter();
        Date date3;
        try {
            date3 = ft1.parse("2021-09-12");
            encounter3.setEncounterDate(date3);
        } catch (ParseException ex) {
            Logger.getLogger(PatientDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        encounter3.setPatient(patient2);
        encounter3.setDiastolic(102);
        encounter3.setSystolic(150);
        
        Encounter encounter4 = new Encounter();
        Date date4;
        try {
            date4 = ft1.parse("2021-09-19");
            encounter4.setEncounterDate(date4);
        } catch (ParseException ex) {
            Logger.getLogger(PatientDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        encounter4.setPatient(patient2);
        encounter4.setDiastolic(89);
        encounter4.setSystolic(146);
        
        

        directory.addPatient(patient2);
        
        
        Patient patient3 = new Patient();
        patient3.setAge(45);
        patient3.setName("Linda");
        patient3.setSSN(236783415);
        patient3.setDoctorName("Peter");
        patient3.setHouse(house3);
        
        Encounter encounter5 = new Encounter();
        Date date5;
        try {
            date5 = ft1.parse("2021-09-23");
            encounter5.setEncounterDate(date5);
        } catch (ParseException ex) {
            Logger.getLogger(PatientDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        encounter5.setPatient(patient3);
        encounter5.setSystolic(120);
        encounter5.setDiastolic(75);
        
        Encounter encounter6 = new Encounter();
        Date date6;
        try {
            date2 = ft1.parse("2021-09-30");
            encounter6.setEncounterDate(date2);
        } catch (ParseException ex) {
            Logger.getLogger(PatientDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        encounter6.setPatient(patient3);
        encounter6.setSystolic(120);
        encounter6.setDiastolic(76);
        

        directory.addPatient(patient3);
        
        Patient patient4 = new Patient();
        patient4.setAge(78);
        patient4.setName("Bob");
        patient4.setSSN(652938091);
        patient4.setDoctorName("Peter");
        patient4.setHouse(house4);
        
        Encounter encounter7 = new Encounter();
        Date date7;
        try {
            date7 = ft1.parse("2021-10-12");
            encounter7.setEncounterDate(date7);
        } catch (ParseException ex) {
            Logger.getLogger(PatientDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        encounter7.setPatient(patient4);
        encounter7.setDiastolic(90);
        encounter7.setSystolic(156);
        
        Encounter encounter8 = new Encounter();
        Date date8;
        try {
            date8 = ft1.parse("2021-10-19");
            encounter8.setEncounterDate(date8);
        } catch (ParseException ex) {
            Logger.getLogger(PatientDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        encounter8.setPatient(patient4);
        encounter8.setDiastolic(90);
        encounter8.setSystolic(154);
        
        

        directory.addPatient(patient4);
        
        encounterList.add(encounter1);
        encounterList.add(encounter2);
        encounterList.add(encounter3);
        encounterList.add(encounter4);
        encounterList.add(encounter5);
        encounterList.add(encounter6);
        encounterList.add(encounter7);
        encounterList.add(encounter8);
        
    }
    
    public void addEncounter(Encounter e){
        encounterList.add(e);
    }
     public void deleteEncounter(Encounter e){
        encounterList.remove(e);
     }
    
}
