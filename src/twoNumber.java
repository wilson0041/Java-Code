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
public class twoNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if (num1 > num2)
        {
            System.out.println("First number is greater than second number");
        }
        else if(num1 == num2)
        {
            System.out.println("First number is equal to second number");
        }
        else
        {
            System.out.println("First number is less than second number");
        }
    }
}
