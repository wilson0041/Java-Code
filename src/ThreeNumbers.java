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
public class ThreeNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNo = sc.nextDouble();
        System.out.print("Enter second number (must be > first): ");
        double secondNo = sc.nextDouble();
        if (firstNo <= secondNo)
        {
            System.out.print("Enter a number: ");
            double thirdNo = sc.nextDouble();
            if (thirdNo >= firstNo && thirdNo <= secondNo)
            {
                System.out.printf("%.1f is between %.1f and %.1f inclusive", thirdNo, firstNo, secondNo);
                System.out.println("");
            }
            else
            {
                System.out.printf("%.1f is outside the range %.1f to %.1f inclusive", thirdNo, firstNo, secondNo);
                System.out.println("");
            }
        }
        else
            System.out.println("Please enter the second number larger than the first number.");
    }
}
