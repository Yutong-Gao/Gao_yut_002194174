package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        system.setCustomerDirectory(new CustomerDirectory());
        system.setRestaurantDirectory(new RestaurantDirectory());
        system.setDeliveryManDirectory(new DeliveryManDirectory());
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        DeliveryMan d1 = system.getDeliveryManDirectory().createDeliveryMan("d1", 60.0);
        DeliveryMan d2 = system.getDeliveryManDirectory().createDeliveryMan("d2", 60.0);
        DeliveryMan d3 = system.getDeliveryManDirectory().createDeliveryMan("d3", 60.0);
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("r1", "r", employee, new AdminRole());
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("r2", "r", employee, new AdminRole());
        UserAccount ua4 = system.getUserAccountDirectory().createUserAccount("c1", "c", employee, new CustomerRole());
        UserAccount ua5 = system.getUserAccountDirectory().createUserAccount("c2", "c", employee, new CustomerRole());
        
        Restaurant r1 = system.getRestaurantDirectory().createRestaurant("five guys", 1234567891, "261 Huntington Ave,Boston",ua2);
        Restaurant r2 = system.getRestaurantDirectory().createRestaurant("chipotle", 1234567892, "148 Brookline Ave,Boston",ua3);
        r1.addDishes("humburger");
        r1.addDishes("cheeseburger");
        
        Customer c1 = system.getCustomerDirectory().createCustomer("c1", 1234123123, "55 station landing ", 20,"2001-07-27",ua4);
        Customer c2 = system.getCustomerDirectory().createCustomer("c2", 1234123125, "75 Saint Aphonsus ", 23,"1998-03-23",ua5);
 
        return system;
    }
    
}
