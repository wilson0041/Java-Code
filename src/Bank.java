/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
public class Bank {
        private final int SIZE = 50;
	private BankAccount[] account;	// an array of BankAccountobjects
	private int numOfAccounts;
	
        // constructor which sets to default size
	public Bank()
	{
		account = new BankAccount[SIZE];
		numOfAccounts = 0;
	}
	
        // constructor which sets to size passed in
	public Bank(int size)
	{
		if (size <0)
			account = new BankAccount[SIZE];
		else
			account = new BankAccount[size];
		numOfAccounts = 0;
	}
	
        // method to add an account
        // returns false if the bank is full
	public boolean addAccount(BankAccount acct)
	{
		if (numOfAccounts == account.length)
			return false;
		account[numOfAccounts++] = acct;
		return true;
	}
	
	// a method to search for an account,
	// given the owner's name
	public BankAccount findAccount(String name)
	{
		for (int i = 0; i < numOfAccounts; i++)
			if (account[i].getOwner().equalsIgnoreCase(name))
				return account[i];
		return null; // not found
	}
	
        // a method to calculate the total of all balances
        // in all accounts
	public double calcTotal()
	{
		double sum = 0.0;
		for (int i = 0; i < numOfAccounts; i++)
			sum += account[i].getBalance();
		return sum;
	}
	
        // returns information about all accounts
	public String getAll()
	{
		String msg = "All accounts :\n";
		for (int i = 0; i < numOfAccounts; i++)
			msg += account[i].toString() + "\n";
		return msg;
		
	}
}
