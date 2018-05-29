/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;
import java.util.Scanner;

class Account
{
    String name;
    int accno;
    int bal;
    
    Account(String n,int acc,int b)
    {
        name=n;
        accno=acc;
        bal=b;
    }
    
    void deposit(int balance)
    {
        bal+=balance;
    }
    
    int display()
    {
        return bal;
    }
    
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
        Scanner inp=new Scanner(System.in);
        int balance;
        int n=1;
        int choice;
        Account a[]=new Account[10];
        dnm:
        for(;;)
        {
            System.out.println("Enter ur choice:\n 1.Create Account\n 2.Deposit\n 3.Withdraw\n 4.Transfer\n 5.Bank Balance\n 6.Richest in bank\n\n 7.exit");
            System.out.println("Enter ur choice:");
            choice=inp.nextInt();
            
            switch(choice)
            {
                case 1:System.out.println("Enter the name and balance\n");
                       String name=inp.next();
                       balance=inp.nextInt();
                       int accno=n;
                       a[n]=new Account(name,accno,balance);
                       n++;
                       break;
                case 2:System.out.println("Enter the balance\n");
                       balance=inp.nextInt();
                       System.out.println("Enter the accno\n");
                       accno=inp.nextInt();
                       int i;
                       for(i=1;i<=n;i++)
                       {
                           if(accno==a[i].accno){
                               a[i].deposit(balance);
                               break;
                           }
                       }
                       int b=a[i].display();
                       System.out.println("Balance=" + b);
                       break;
                       
                
                       
                
                
                case 7: System.exit(0);
            }
                       
             System.out.println(n);
                       
            
    }
    
}
}
