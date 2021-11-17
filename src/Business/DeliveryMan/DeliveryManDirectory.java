/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManList; 

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }

    public DeliveryManDirectory() {
        deliveryManList = new ArrayList();
    }
    
    public DeliveryMan createDeliveryMan(String name,double wage){
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryMan.setWage(wage);
        deliveryMan.setName(name);
        deliveryManList.add(deliveryMan);
        return deliveryMan;
    }
    
    public void removeDeliveryMan(DeliveryMan deliveryMan){
         
                deliveryManList.remove(deliveryMan);
                
            
    }
    
    public void updateDeliveryMan(int id,String name,double wage){
         for(DeliveryMan deliveryMan:this.deliveryManList){
            if (deliveryMan.getId()==id){
                deliveryMan.setWage(wage);
                deliveryMan.setName(name);
                
            }
         }
    
    }
    
    
}
