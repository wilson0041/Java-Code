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
public class Tshirt {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double price;
        System.out.print("How many? ");
        int shirtNo = sc.nextInt();
        if (shirtNo < 10 && shirtNo >= 0)
        {
            price = shirtNo * 15;
            System.out.printf("%d T-shirts costs RM %.1f", shirtNo, price);
            System.out.println("");
        }
        else if (shirtNo >= 10)
        {
            price = shirtNo * 14;
            System.out.printf("%d T-shirts costs RM %.1f", shirtNo, price);
            System.out.println("");
        }
        else
            System.out.println("Please enter a positive integer!");
        
    }
}
