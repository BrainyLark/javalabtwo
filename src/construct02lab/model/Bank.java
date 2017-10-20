/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construct02lab.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author archer
 */
public class Bank {
    private String name;
    private List<Customer> customers;
    
    Bank(String bankName) {
        this.name = new String(bankName);
        this.customers = new LinkedList<>();
    }
    /**
     * this function is adding customer
     * @param customer 
     */
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }
    /**
     * this function is getting customer
     * @param customerNumber
     * @return 
     */
    
    public Customer getCustomer(long customerNumber) {
        for(Customer cust : this.customers){
            if(cust.getCustomerNumber() == customerNumber)
                return cust;
        }
        return null;
    }
    
    public String getName() {
        return this.name;
    }
    
}
