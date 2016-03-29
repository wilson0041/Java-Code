/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
public class Shop2 {
    static final int SIZE = 5;
    private Item[] items;
    private int counter;
    
    public Shop2()
    {
        items = new Item[SIZE];
        counter = 0;
    }
    public Shop2(int size)
	{
 		if (size < 0)
                    items = new Item[SIZE];
                else
                    items = new Item[size];
                counter = 0;
	}

	// a method that returns the number of items currently stored
	public int noOfItems()
	{	
            return counter;
	}
	
// A method called add that takes a parameter of Item, and proceed to // add the item into the array, if there is space, and returns true. // If there is no more space, the parametric item is NOT added, and // false is returned.
	public boolean add(Item anItem)
	{	
            if (counter == items.length)
                return false;
            items[counter++] = anItem;
            return true;
	}
	
	// a method to return the total price of all the items.
	public double totalPrice()
	{	
            double sum = 0.0;
            for (int i = 0; i < counter; i++)
            {
                sum += items[i].getPrice();
            }
            if (counter > 0)
                    return sum;
                else
                    return 0;
	}
	
	// a method to find the most expensive item
	public Item mostExpensive()
	{	
            Item exp = items[0];
            for (int j = 0; j < counter; j++)
            {
                if (items[j].getPrice() > exp.getPrice())
                exp = items[j];
            }
            return exp;
	}
	
	// a method to find the item with the required name passed in
	public Item search(String name)
	{
 		for (int j = 0; j < counter; j++)
                if (items[j].getName().equals(name))
                    return items[j];
                return null;
	}
	
	// method to return information about all the Items in the shop,
	// one per line.
	public String getAll()
	{
 		String message = "Items :-";
                for (int j = 0; j < counter; j++)
                    message += items[j].toString() + "\n";
                return message;
	}
        
        public String getQtyLessThan (int amount)
        {
            String message = "Items that < " + amount + "\n";
                for (int j = 0; j < counter; j++)
                    if (items[j].getQtyAvailable() < amount)
                        message += items[j].toString() + "\n";
                return message;
        }

}
