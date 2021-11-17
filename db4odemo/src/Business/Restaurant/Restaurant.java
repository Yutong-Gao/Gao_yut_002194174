/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String name;
    private int phoneNum;
    private String address;
    private int id;
    private UserAccount userAccount;
    private static int count=1;
    private ArrayList<String> menu = new ArrayList();

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Restaurant() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void addDishes(String dishes){
        menu.add(dishes);
    }
    
    public void removeDishes(String dishes){
        menu.remove(dishes);
    }

    public ArrayList<String> getMenu() {
        return menu;
    }

    @Override
    public String toString() {
        return  name;
    }
    
    
}
