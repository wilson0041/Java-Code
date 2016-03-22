/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
public class BankAccount {
        private String owner;
	private double balance;

	// default constructor with no args
	public BankAccount()
	{		
		owner = "nobody";
		balance = 0.0;
	}
	
        // Constructor with argument 
	public BankAccount(String inOwner)
	{
                if (inOwner.equals(""))
                    owner = "nobody";
                else
                    owner = inOwner;
                balance = 0.0;
	}

        // getters
	public String getOwner()
	{
		return owner;
	}
	
	public double getBalance()
	{
		return balance;
	}

        // setters
	public void setOwner(String newOwner)
	{
            if (!newOwner.equals(""))
		owner = newOwner;
	}
	
        // deposit some money in the account
	public boolean deposit(double amount)
	{
		if (amount < 0)
			return false;
		balance += amount;
		return true;
	}
	
        
        // withdraw money from the account
	public boolean withdraw(double amount)
	{
		// check if enough balance
		if (amount > balance || amount < 0)
			return false;
		balance -= amount;
		return true;
	}
	
        
        // display information about the account
	public String toString()
	{
		return "Bank Account for " + owner + " has balance " + balance;
	}
}
