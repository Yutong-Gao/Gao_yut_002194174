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
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantList;

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    public RestaurantDirectory() {
        restaurantList = new ArrayList();
    }
    
    public Restaurant createRestaurant(String name,int phoneNum,String address,UserAccount ua){
        Restaurant restaurant = new Restaurant();
        restaurant.setAddress(address);
        restaurant.setPhoneNum(phoneNum);
        restaurant.setName(name);
        restaurant.setUserAccount(ua);
        restaurantList.add(restaurant);
        return restaurant;
    }
    
    public void removeRestaurant(Restaurant restaurant){
         
                restaurantList.remove(restaurant);
                
            
    }
    
    public void updateRestaurant(int id,String name,int phoneNum,String address,UserAccount ua){
         for(Restaurant restaurant:this.restaurantList){
            if (restaurant.getId()==id){
                restaurant.setAddress(address);
                restaurant.setPhoneNum(phoneNum);
                restaurant.setName(name);
                restaurant.setUserAccount(ua);
                
            }
         }
    
    }
    
    
}
