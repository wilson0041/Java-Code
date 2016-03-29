/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
public class Item {
	// attributes
	private String name;
	private int qtyAvailable;
	private double price;
	
	// methods
	// constructor with arguments
	public Item(String nameIn, double priceIn)
	{
		name = nameIn;
		price = priceIn;
		qtyAvailable = 0;
	}
	
	//setters
	public void setName(String nameIn)
	{
		name = nameIn;
	}
	
	public void setPrice(double priceIn)
	{
		if (priceIn < 0)
			priceIn = -priceIn;
		price = priceIn;
	}
	
	public String getName()
	{
		return name;
	}
	
	// getters
	public double getPrice()
	{
		return price;
	}
	
	public double getQtyAvailable()
	{
		return qtyAvailable;
	}
	
	// a method to add stock of the item, the 
	// qty available should increase by the stock added
	public void addStock(int qty)
	{
		if (qty>0)
			qtyAvailable+=qty;
	}

	public boolean sell(int qty)
	{
		if (qty < 0)
			return false;
		if (qtyAvailable<qty)
			return false;
		qtyAvailable -=qty;
		return true;
	}
	
	public String toString()
	{
		return String.format("%s costs $%.2f with qty avaiable %d", name, price, qtyAvailable); 
	}
}
