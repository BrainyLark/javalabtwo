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
public class ATM {
    private List<Bank> bank; 
    private boolean state;
    private Customer currentCustomer;
    private Account currentAccount;
    
    /**
     * This is the constructor method of ATM class
     * @param stateParam
     * @param custParam
     * @param accParam 
     */
    ATM(boolean stateParam, Customer custParam, Account accParam) {
        this.bank = new LinkedList<>();
        /**
         * This state is the representation of how the specied.
         */
        this.state = stateParam;
        this.currentCustomer = custParam;
        this.currentAccount = accParam;
    }
    /**
     * this function is used for withdrawing
     * @param account
     * @param withdrawlAmount
     * @return 
     */
    /*This function is used for withdrawing amount of money in parameter from an account*/
    public String withdraw(Account account, double withdrawlAmount) {
        if(account.withdraw(withdrawlAmount) == 0){
            return "Success";
        } else {
            return "Fail";
        }
    }
}
