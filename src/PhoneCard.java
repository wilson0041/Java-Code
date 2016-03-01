/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
public class PhoneCard
{
	// instance variables or attributes
	private String phoneNumber;
	private double balance;
	
	// no-arguments constructor
	public PhoneCard()
	{
		phoneNumber = "Not set yet";
		balance = 0.0;
	}
	
	// constructor with arguments
	public PhoneCard(String inNumber, double inBalance)
	{
		phoneNumber = inNumber;
		if (inBalance > 0)
			balance = inBalance;
		else
			balance = 0.0;
	}
	
	// getters, or accessor/reader methods 
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	// setters, or writer/mutator methods
	public void setPhoneNumber(String newPhoneNumber)
	{
		phoneNumber = newPhoneNumber;
	}
	
	public void setBalance(double newBalance)
	{
		if (newBalance >= 0)
			balance = newBalance;
	}
	
	// topUp() method to top up the balance by an amount
	public void topUp(double amount)
	{
		if (amount > 0)
			balance += amount;
	}
	
	// Method to record calls made, thus reducing balance
	public boolean makeCall(double duration, double costPerMin)
	{
		double cost = duration * costPerMin;
		if (cost > 0)
			balance -= cost;
		else
			return false;	// invalid parameters
		
		if (balance < 0)
		{
			balance = 0; 	// set to zero
			return false;
		}
		return true;
			
	}

	
	// toString() method
	public String toString()
	{
		return phoneNumber + " has a balance of " + balance;
	}	
		
		
		
		
		
		
		
		
	
	
	
}
