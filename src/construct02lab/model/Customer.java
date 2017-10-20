/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construct02lab.model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author archer
 */
public class Customer {
    
    /**
     * This class is supposed to be creating Customer objects
    */
    private String name;
    private long customerNumber;
    private int pin;
    private List<Account> accounts;
    /**
     * this function is constructor for any Customer object
     * @param custName
     * @param custNum
     * @param pinNum
     * @param acc 
     */
    Customer(String custName, long custNum, int pinNum, String acc) {
        //this is the constructor for customer
        this.name = custName;
        this.customerNumber = custNum;
        this.pin = pinNum;
        this.accounts = new LinkedList<>();
    }
    /**
     * this function is getting account
     * @return 
     */
    public List<Account> getAccount() {
        return this.accounts;
    }
    
    /**
     * the function is used for getting customer's number
     * @return 
     */
    
    public long getCustomerNumber() {
        return this.customerNumber;
    }
}
