/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;
import java.util.Scanner;
/**
 * 
 * @author SAGAR KALAL
 * 
 */

class Account
{
    String name;
    int accno;
    int bal;
    
    
    /**
     * Create an account
     * @param nam this takes the name of the account holder
     * @param acc this is to give the account number
     * @param b this is to gives the initial balance amount
     */

    Account(String nam,int acc,int b)
    {
        name=nam;
        accno=acc;
        bal=b;
    }
    /**
     * Deposit to an account
     * @param balance This is to take the deposit amount
     */
    void deposit(int balance)
    {
        bal+=balance;
    }
    /**
     * Display the balance in an account
     * @return The balance amount in the account
     */
    
    int display()
    {
        return bal;
    }
    /**
     * Withdraw from an account
     * @param balance This takes the amount to be withdrawn
     */
    void withdraw(int balance)
    {
        if(bal<balance)
            System.out.println("Insufficient Balance!!");
        else
            bal-=balance;
    }
}

public class Banking {

    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         *inp the object of Scanner class
         *
         */
        Scanner inp=new Scanner(System.in);
        int balance=0;
        int n=1;
        int i=0;
        int choice;
        Account a[]=new Account[10];
        dnm:
        for(;;)
        {
            /**
             * Menu that display facilities of the bank
             * choice: obtains the interested facility
             * Based on the choice switching is done to perform the choose facility
             *
             */
            System.out.println("Enter ur choice:\n 1.Create Account\n 2.Deposit\n 3.Withdraw\n 4.Transfer\n 5.Bank Balance\n 6.Richest in bank\n 7.Individual Balance\n 8.exit");
            System.out.println("Enter ur choice:");
            choice=inp.nextInt();
            
            switch(choice)
            {
                case 1:/**
                 *1.Create an account
                 * Accept the name and initial balance 
                 * each instance of class creates an account
                 * later constructor creates the account based on user details 
                 * Bank is capable of opening 10 accounts
                 * 
                 */
                       System.out.println("Enter the name and balance\n");
                       String name=inp.next();
                       balance=inp.nextInt();
                       int accno=n;
                       a[n]=new Account(name,accno,balance);
                       n++;
                       break;
                       
                       /**
                        * 2.Deposit the amount
                        * account no and deposit amount is obtained
                        * deposit() method is called
                        */
                case 2:System.out.println("Enter the balance\n");
                       balance=inp.nextInt();
                       System.out.println("Enter the accno\n");
                       accno=inp.nextInt();
                       
                       for(i=1;i<n;i++)
                       {
                           if(accno==a[i].accno){
                               a[i].deposit(balance);
                               break;
                           }
                       }
                       /*int b=a[i].display();
                       System.out.println("Balance=" + b);*/
                       break;
                       
                       
                        /**
                        * 2.Withdraw the amount
                        * account no and withdraw amount is obtained
                        * withdraw() method is called
                        */
                case 3:System.out.println("Enter the balance\n");
                       balance=inp.nextInt();
                       System.out.println("Enter the accno\n");
                       accno=inp.nextInt();
                      
                       for(i=1;i<n;i++)
                       {
                           if(accno==a[i].accno){
                               a[i].withdraw(balance);
                               break;
                           }
                       }
                       break;
                
                        /**
                        * 2.Transfer the amount between accounts
                        * account numbers and withdraw amount is obtained
                        * withdraw() method is called
                        * deposit() method called
                        */
                case 4:System.out.println("Enter the accno. of the person u want to transfer:");
                       accno=inp.nextInt();
                       System.out.println("Enter ur account number:");
                       int saccno=inp.nextInt();
                       for(i=1;i<n;i++)
                       {
                           if(saccno==a[i].accno){
                               for(int j=1;j<n;j++){
                      
                                    if(accno==a[j].accno){
                                        
                                        System.out.println("Enter the amount to transfer:");
                                        balance=inp.nextInt();
                                        a[i].withdraw(balance);
                                        a[j].deposit(balance);                           
                                        System.out.println(i+"   " +j+"  ");
                                        break;
                                       
                                    }
                               }
                           }
                       }

                       break;
                       
                       /**
                        * The total amount in the bank
                        */
                case 5:balance=0;
                       for(i=1;i<n;i++){
                       balance+=a[i].bal;
                      }
                      System.out.println("The total amount in the bank= "+ balance);
                      break;
                      
                      /**
                       * The first richest person in the bank
                       */
                      
                case 6:
                        int maxbal=0;
                        int j=0;
                        for(i=1;i<n;i++){
                            if(maxbal<a[i].bal){
                                maxbal=a[i].bal;
                                j=i;
                            }
                        }    
                        System.out.println("The richest person in the bank is :" + a[j].name);
                        break;
                        
                        /**
                         * To display the account balance
                         */
                case 7:System.out.println("Enter the accno\n");
                       accno=inp.nextInt();
                       int flag=0;
                       for(i=1;i<n;i++)
                       {
                           if(accno==a[i].accno){
                               System.out.println("Amount= "+ a[i].display());
                               flag=1;
                               break;
                           }
                       }
                       if(flag==0)
                           System.out.println("Account doesn't exist...");
                       break;
                
                case 8: System.exit(0);
            }
    
    }
    
}
}
