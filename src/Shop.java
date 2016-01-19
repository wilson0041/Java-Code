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
public class Shop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double item1price, item2price, totalPrice;
        String item1, item2;
        int discountValue, item1Total, item2Total;
        System.out.println("Welcome to the \"E\"-Shop");
        System.out.print("Enter the first item: ");
        item1 = sc.nextLine();
        System.out.print("The price per unit is RM");
        item1price = sc.nextDouble();
        System.out.print("How many you want: ");
        item1Total = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the second item: ");
        item2 = sc.nextLine();
        System.out.print("The price per unit is RM");
        item2price = sc.nextDouble();
        System.out.print("How many you want: ");
        item2Total = sc.nextInt();
        System.out.print("The discount of the day is: ");
        discountValue = sc.nextInt();
        totalPrice = (item1price * item1Total + item2price * item2Total) * (100 - discountValue) / 100;
        System.out.print("Total price is RM");
        System.out.printf("%.2f", totalPrice);
        System.out.println();
    }
}
