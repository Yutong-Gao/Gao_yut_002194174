/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author gyt
 */
public class Person {
    
    private String name;
    private String geographicData;
    private Date dateOfBrith;
    private String teleNumbers;
    private String faxNumbers;
    private String emailAddresses;
    private String ssn;
    private String medicalRecordNum;
    private String healthPlanBeneNum;
    private String bankAccountNum;
    private String cerificateLicenseNum;
    private String vehicleIdAndSerialNum;
    private String deviceIdAndSeriaNum;
    private String linkedln;
    private String internetProtocalAd;
    private ImageIcon biometricId;

    public ImageIcon getBiometricId() {
        return biometricId;
    }

    public void setBiometricId(ImageIcon biometricId) {
        this.biometricId = biometricId;
    }

    public ImageIcon getFullFacePhotos() {
        return fullFacePhotos;
    }

    public void setFullFacePhotos(ImageIcon fullFacePhotos) {
        this.fullFacePhotos = fullFacePhotos;
    }
    private ImageIcon fullFacePhotos;
    private String ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographicData() {
        return geographicData;
    }

    public void setGeographicData(String geographicData) {
        this.geographicData = geographicData;
    }

    public Date getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(Date dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }

    public String getTeleNumbers() {
        return teleNumbers;
    }

    public void setTeleNumbers(String teleNumbers) {
        this.teleNumbers = teleNumbers;
    }

    public String getFaxNumbers() {
        return faxNumbers;
    }

    public void setFaxNumbers(String faxNumbers) {
        this.faxNumbers = faxNumbers;
    }

    public String getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(String emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMedicalRecordNum() {
        return medicalRecordNum;
    }

    public void setMedicalRecordNum(String medicalRecordNum) {
        this.medicalRecordNum = medicalRecordNum;
    }

    public String getHealthPlanBeneNum() {
        return healthPlanBeneNum;
    }

    public void setHealthPlanBeneNum(String healthPlanBeneNum) {
        this.healthPlanBeneNum = healthPlanBeneNum;
    }

    public String getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(String bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public String getCerificateLicenseNum() {
        return cerificateLicenseNum;
    }

    public void setCerificateLicenseNum(String cerificateLicenseNum) {
        this.cerificateLicenseNum = cerificateLicenseNum;
    }

    public String getVehicleIdAndSerialNum() {
        return vehicleIdAndSerialNum;
    }

    public void setVehicleIdAndSerialNum(String vehicleIdAndSerialNum) {
        this.vehicleIdAndSerialNum = vehicleIdAndSerialNum;
    }

    public String getDeviceIdAndSeriaNum() {
        return deviceIdAndSeriaNum;
    }

    public void setDeviceIdAndSeriaNum(String deviceIdAndSeriaNum) {
        this.deviceIdAndSeriaNum = deviceIdAndSeriaNum;
    }

    public String getLinkedln() {
        return linkedln;
    }

    public void setLinkedln(String linkedln) {
        this.linkedln = linkedln;
    }

    public String getInternetProtocalAd() {
        return internetProtocalAd;
    }

    public void setInternetProtocalAd(String internetProtocalAd) {
        this.internetProtocalAd = internetProtocalAd;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

   
    
    
    
}
