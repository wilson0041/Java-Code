/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
public class Arithmetic {
    public static void main(String[] args)
    {
        int num1 = 5, num2 = 8;
        int quotient, remainder;
        double total, average;
        
        total = num1 + num2;
        average = total / 2;
        quotient = num1 / num2;
        remainder = num1 % num2;
        
        System.out.println("total = " + total);
        System.out.println("average = " + average);
        System.out.println("quotient = " + quotient);
        System.out.println("remainder = " + remainder);
    }
}
