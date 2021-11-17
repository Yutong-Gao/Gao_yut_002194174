/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public WorkRequest createWorkRequest(Customer customer, Restaurant restaurant,String items){
        WorkRequest order = new WorkRequest();
        order.setCustomer(customer);
        order.setRestaurant(restaurant);
        order.setItems(items);
        order.setStatus("waiting for deliver");
        this.workRequestList.add(order);
        return order;
    }
    
    public void addComment(String comment, WorkRequest order){
        for(WorkRequest o : this.workRequestList){
            if(o.equals(order)){
                o.setComments(comment);
            }
        }
    }   
}