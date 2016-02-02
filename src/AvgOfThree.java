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
public class AvgOfThree {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum;
        double average;
        System.out.print("Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Number 2: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Number 3: ");
        int num3 = sc.nextInt();
        sc.nextLine();
        sum = num1 + num2 + num3;
        average = sum / 3;
        System.out.println("");
        System.out.println("Total: " + sum);
        System.out.println("Average: " + average);
        
    }
}
