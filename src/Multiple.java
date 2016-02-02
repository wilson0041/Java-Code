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
public class Multiple {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int int1st = sc.nextInt();
        System.out.print("Enter second integer: ");
        int int2nd = sc.nextInt();
        if (int1st % int2nd == 0)
            System.out.printf("%d is divisible by %d => true", int1st, int2nd);
        else
            System.out.printf("%d is divisible by %d => false", int1st, int2nd);
        System.out.println("");
    }
}
