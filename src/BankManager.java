/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
import java.util.*;
public class BankManager {
    
    public static Scanner sc;
            
    public static void main(String[] args)
    {
        sc = new Scanner(System.in);
        
        // Create a Bank object
        Bank bk = new Bank(5);
        System.out.println("Welcome to My Bank");
        // provide a menu
        int choice;
        do {
            System.out.println("Would you like to:");
            System.out.println("1. Add account to the bank");
            System.out.println("2. Search for account");
            System.out.println("3. Make a Deposit");
            System.out.println("4. Make a Withdrawal");
            System.out.println("5. Display Total");
            System.out.println("6. Display ALL accounts");
            System.out.println("7. Quit");
            System.out.print("Enter your choice :");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1: addNewAccount(bk); break;
                case 2: searchForAccount(bk); break;
                case 3: makeDeposit(bk);break;
                case 4: makeWithdrawal(bk); break;
                case 5: System.out.println("Total in the bank: " + bk.calcTotal());break;
                case 6: System.out.println(bk.getAll()); break;
                case 7: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice");break;
            }
        } while (choice != 7);       
                    
                          
    } // end of main method
          
    // A method to add a bank account to the bank
    public static void addNewAccount(Bank b)
    {
        System.out.println("Enter name of account owner");
        String ownername = sc.nextLine();
        while (ownername.equals(""))
        {
            System.out.println("Name cannot be blank");
            System.out.println("Enter name of account owner");
            ownername = sc.nextLine();
        }
        BankAccount ba = new BankAccount(ownername);
        if (b.addAccount(ba))
            System.out.println("Account added");
        else
            System.out.println("Account not added. Bank is full");
    }
    
    // a method to display information about a particular account
    public static BankAccount searchForAccount(Bank b)
    {
        System.out.print("Enter name of owner to search for :");
        String wanted = sc.nextLine();
        BankAccount foundAcct = b.findAccount(wanted);
        if (foundAcct != null)
        {
            System.out.println(foundAcct.toString());
            return foundAcct;
        }
        else
        {   
            System.out.println("Account with this name not found");
            return null;
        }
    }
    
    // make a deposit
    public static void makeDeposit(Bank b)
    {
        BankAccount foundAcct = searchForAccount(b);
        if (foundAcct != null)
        {
            System.out.print("Enter deposit amount :");
            double depAmount = sc.nextDouble();
            if (foundAcct.deposit(depAmount))
                System.out.println("Deposit successful");
            else
                System.out.println("Deposit failed");
        }
    }
    
    // make a withdrawal
    public static void makeWithdrawal(Bank b)
    {
        BankAccount foundAcct = searchForAccount(b);
        if (foundAcct != null)
        {
            System.out.print("Enter withdrawal amount :");
            double amount = sc.nextDouble();
            if (foundAcct.withdraw(amount))
                System.out.println("Withdrawal successful");
            else
                System.out.println("Withdrawal failed");
        }
    }
    
}
