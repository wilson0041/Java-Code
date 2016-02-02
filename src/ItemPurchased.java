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
public class ItemPurchased {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double totalCost, discountPrice, netCost;
        System.out.println("A program to find the cost for three purchased items");
        System.out.println("");
        System.out.print("What is the cost of item 1? ");
        int item1 = sc.nextInt();
        System.out.print("What is the cost of item 2? ");
        int item2 = sc.nextInt();
        sc.nextLine();
        System.out.print("What is the cost of item 3? ");
        int item3 = sc.nextInt();
        sc.nextLine();
        System.out.print("What is the discount rate (an integer, e.g. 5%)? ");
        int discount = sc.nextInt();
        sc.nextLine();
        totalCost = item1 + item2 + item3;
        discountPrice = totalCost * discount / 100;
        netCost = totalCost - discountPrice;
        System.out.printf("Cost of 3 items = RM %.1f \n", totalCost);
        System.out.printf("%d discount = RM %.1f \n", discount, discountPrice);
        System.out.printf("Net cost = RM %.1f \n", netCost);
        System.out.println("");
    }
}
