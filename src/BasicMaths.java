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
public class BasicMaths {
    public static int maxInt(int num1, int num2, int num3)
    {
        int num4 =  Math.max(num1, num2);
        return Math.max(num4, num3);
    }
    public static double maxDouble(int num1, int num2)
    {
        return Math.max(num1, num2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        int intMax = maxInt(num1, num2, num3);
        double doubleMax = maxDouble(num1, num2);
        System.out.println("Highest number is " + intMax);
        System.out.println("Highest number is " + doubleMax);
    }
}
