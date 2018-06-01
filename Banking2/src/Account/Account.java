package Account;

import sun.security.provider.certpath.BuildStep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KRISHNA KALAL
 */
class Account {
    int balance=500;
    int acc=100;
    
    int addAccount(int accno)
    {
        acc=accno;
        if(accno==acc)
            return acc;
        else 
            return 0;
    }
    
    int deposit(int amt,int accno) {
        if(acc==accno)
        {
            balance+=amt;
            return balance;      
        }
        else 
        return 0;
    }

    int withdraw(int amt,int accno)  {
        if(acc==accno){
            balance-=amt;
            return balance;
        }
        else
        return 0;
            
        
    }
    
    
}
