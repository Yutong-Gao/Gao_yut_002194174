/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
       
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer createCustomer(String name,int phoneNum,String address,int age,String birthday,UserAccount ua){
        Customer customer = new Customer();
        customer.setAddress(address);
        customer.setAge(age);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = ft.parse(birthday);
        } catch (ParseException ex) {
            
        }
        customer.setBirthday(date);
        customer.setPhoneNum(phoneNum);
        customer.setUsername(name);
        customer.setUa(ua);
        customerList.add(customer);
        return customer;
    }
    
    public void removeCustomer(Customer customer){
        
                customerList.remove(customer);
          
    }
    
    public void updateCustomer(int id,String username,int phoneNum,String address,int age,String birthday,UserAccount ua){
         for(Customer customer:this.getCustomerList()){
            if (customer.getId()==id){
                customer.setAddress(address);
                customer.setAge(age);
                customer.setPhoneNum(phoneNum);
                customer.setUsername(username);
                customer.setUa(ua);
                SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date();
                try {
                     date = ft.parse(birthday);
                } catch (ParseException ex) {
            
                }
                customer.setBirthday(date);
                
            }
         }
    
    }
}
