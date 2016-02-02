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
public class CompareNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int difference, product;
        System.out.print("Enter first integer: ");
        int int1st = sc.nextInt();
        System.out.print("Enter second integer: ");
        int int2nd = sc.nextInt();
        difference = int1st - int2nd;
        product = int1st * int2nd;
        if (int1st > int2nd)
            System.out.printf("The difference between this 2 numbers is %d", difference);
        else if (int1st == int2nd)
            System.out.println("Both numbers are equal");
        else
            System.out.printf("The product of this 2 numbers is %d", product);
        System.out.println("");
        
    }
}
