import java.util.*;
public class ShopKeeper {
    
    public static Scanner sc = new Scanner(System.in);
    public static Shop2 sh;
    
    public static void main(String[] args)
    {
        sh = new Shop2(5);
        
        int choice;
        do
        {   
            System.out.println("Would you like to:");
            System.out.println("1) add an item to the shop");
            System.out.println("2) show all items in the shop");
            System.out.println("3) maintain item");
            System.out.println("4) show the average price of all items");
            System.out.println("5) show the most expensive item");       
            System.out.println("6) maintain low stock items ");
            System.out.println("0) Quit");
            System.out.print("Enter your choice");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1: addItem(); break;
                case 2: System.out.println(sh.getAll()); break;
                case 3: maintainItem(); break;
                case 4: System.out.print("Average price of all items is ");
                        System.out.println(sh.averagePrice()); break;
                case 5: showMostExpensive(); break;
                case 6: lowStock(); break;
                case 0: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice"); break;
            }
        } while (choice != 0);
    }
    
    // a method to add an item
    public static void addItem()
    {
        System.out.println("\nAdding a new item");
        System.out.print("Enter item name :");
        String name = sc.nextLine();
        System.out.print("Enter item price :");
        double price = sc.nextDouble();
        sc.nextLine();
        Item newItem = new Item(name, price);
        if (sh.add(newItem))
            System.out.println(newItem.toString() + " added");
        else
            System.out.println("Item not added, shop is full");
    }
    
    // a method to maintain an item
    public static void maintainItem()
    {
        System.out.print("Enter name of item required :");
        String wantedItemName = sc.nextLine();
        Item foundItem = sh.search(wantedItemName);
        if (foundItem==null)
            System.out.println("Item not found");
        else
        {
            System.out.println("Found : " + foundItem.toString());
            System.out.println("Would you like to :");
            System.out.println("1. change name");
            System.out.println("2. change price");
            System.out.println("3. add stock");
            System.out.println("4. sell this item");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1)
            {
                System.out.print("Enter new name :");
                String name = sc.nextLine();
                foundItem.setName(name);
            }
            else if (choice == 2)
            {
                System.out.print("Enter new price :");
                double price = sc.nextDouble();
                sc.nextLine();
                foundItem.setPrice(price);
            }
            else if (choice == 3)
            {
                System.out.println("Enter quantity of stock to add");
                int qty = sc.nextInt();
                sc.nextLine();
                foundItem.addStock(qty);
            }
            else if (choice == 4)
            {
                System.out.println("Enter quantity to sell");
                int sellQty = sc.nextInt();
                sc.nextLine();
                if (sellQty > foundItem.getQtyAvailable())
                    System.out.println("Cannot sell more than stock available");
                else
                    foundItem.sell(sellQty);
            }
            else 
                System.out.println("Invalid choice");
        }
    }
    
    // display the most expensive item
    public static void showMostExpensive()
    {
        Item item = sh.mostExpensive();
        if (item == null)
            System.out.println("There are no items in the shop");
        else
        {
            System.out.println("Most expensive item is ");
            System.out.println(item.toString());
        }
    }
    
    // maintain low stock items
    public static void lowStock()
    {
        System.out.print("Enter stock amount to check :");
        int amount = sc.nextInt();
        Item[] lowItem = sh.getQtyLessThan(amount);
        if (lowItem == null)
            System.out.println("No Low Stock Items");
        else
        {
            for (int i = 0; i < lowItem.length; i++)
            {
                System.out.println(lowItem[i].toString());
                System.out.print("Enter qty to add");
                int qty = sc.nextInt();
                sc.nextLine();
                lowItem[i].addStock(qty);
            }
        }
    }
}