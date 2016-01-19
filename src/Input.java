/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
import java.util.Scanner;
public class Input {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Now enter the second number: ");
        int num2 = sc.nextInt();
        int total;
        total = num1 + num2;
        System.out.println(total);
    }
}
