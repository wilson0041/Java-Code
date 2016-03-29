public class Shop2
{
    static final int SIZE = 5; // symbolic constant
    // attributes
    private Item[] items; // an array to store all the items
    private int counter;  // keep track of how many items are stored

    // default constructor to create the array with 
    // default size and set counter to 0. 
    public Shop2()
    {	
        items = new Item[SIZE];
        counter = 0;
    }

    // A constructor that accepts an integer 
    // representing the size of the array to be created. 
    // If the size is 0 or negative, then a 
    // default size of SIZE will be used as the array size,
    // otherwise the parametric value passed in will be 
    // the size of the array.
    public Shop2(int size)
    {
        if (size <= 0)
            items = new Item[SIZE];
        else
            items = new Item[size];
        counter = 0;
    }

    // a method that returns the number of items 
    // currently stored
    public int noOfItems()
    {	
        return counter;
    }

    // A method called add that takes a parameter of Item,
    // and proceed to add the item into the array,
    // if there is space, and returns true. 
    // If there is no more space, the parametric item is 
    // NOT added, and false is returned.
    public boolean add(Item anItem)
    {	
        // if the array is full, return false
        if (counter == items.length)
            return false;
        // if the array is not full, add the item to the array and 
        // increment counter
        items[counter] = anItem;
        counter = counter + 1;
        return true;
    }

    // a method to return the average price of all the items.
    public double averagePrice()
    {	
        double total = 0.0;
        for (int i = 0; i < counter; i++)
        {
            total += items[i].getPrice();
        }
        if (counter > 0)
            return total / counter;
        else
            return 0;
    }

    // a method to find the most expensive item
    public Item mostExpensive()
    {	
        Item mostExp = items[0];
        for (int i = 1; i < counter; i++)
        {
            if (items[i].getPrice()>mostExp.getPrice())
                mostExp = items[i];
        }
        return mostExp;
    }

    // a method to find the item with the required name passed in
    public Item search(String name)
    {
            for (int i = 0; i < counter; i++)
                if (items[i].getName().equalsIgnoreCase(name))
                    return items[i];
            return null;
    }

    // method to return information about all the Items in the shop,
    // one per line.
    public String getAll()
    {
        String str = "All Items: \n";
        for (int i = 0; i < counter; i++)
            str += items[i].toString() + "\n";
        return str;
    }
    
    // method to return a list of items with qty less 
    // than a specific amount, the array is exactly the 
    // right size
    public Item[] getQtyLessThan(int amount)
    {
       // first count how many items are below the required 
        // stock qty
        int count = 0;
        for (int i = 0; i < counter; i++)
            if (items[i].getQtyAvailable()< amount)
                count++;
        
        if (count == 0)
            return null;
        // create the array
        Item[] lowStockItems = new Item[count];
        
        // put items which are low stock in the array
        int pos = 0;
        for (int i = 0; i < counter; i++)
            if (items[i].getQtyAvailable()< amount)
            {    
                lowStockItems[pos] = items[i];
                pos++;  // move to next pos
            }
        return lowStockItems;
    }
}