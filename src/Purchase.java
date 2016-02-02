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
public class Purchase {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price: RM");
        double price = sc.nextDouble();
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        double totalCost;
        totalCost = price * amount;
        System.out.println("The total cost is RM " + totalCost);
    }
}
