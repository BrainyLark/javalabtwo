/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construct02lab.model;

/**
 *
 * @author archer
 */
public class Account {
    private double balance;
    private long accountNumber;
    
    Account(double balance, long accNumber) {
        this.balance = balance;
        this.accountNumber = accNumber;
    }
    
    /**
     * this function is used to withdraw some amount of money
     * @param withdrawlAmount
     * @return 
     */
    
    public int withdraw(double withdrawlAmount) {
        if(withdrawlAmount > this.balance) {
            return 0;
        }
        else {
            this.balance -= withdrawlAmount;
            return 1;
        }
    }
    
    /**
     * this function is used for depositing money
     * @param depositAmount 
     */
    
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }
    
}
