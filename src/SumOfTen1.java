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
public class SumOfTen1
{
	public static final int SIZE = 10;

	public static void main(String[] args)
	{
	   Scanner sc = new Scanner (System.in);
		System.out.println("A program that find and display the sum of " + SIZE + " integer numbers entered by user.");
		System.out.println();

		int [] num = new int[SIZE];
		int sum = 0, i, j = 0;
                for(i = 0; i < 10; i++)
                {
                    System.out.print("Enter integer " + (i + 1) + ": ");
                    num[i] = sc.nextInt();
                    sum = sum + num[i];
                }
		System.out.println("Sum of all " + SIZE + " integers = " + sum);
	}
}
