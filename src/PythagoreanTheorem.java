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
public class PythagoreanTheorem {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double m, n, side1, side2 ,h;
        System.out.print("Enter the side 1 length: ");
        m = sc.nextDouble();
        System.out.print("Enter the side 2 length: ");
        n = sc.nextDouble();
        sc.nextLine();
        side1 = m * m - n * n;
        side2 = 2 * m * n;
        h = m * m + n * n;
        System.out.printf("Side1 = %.2f", side1);
        System.out.println("");
        System.out.printf("Side2 = %.2f", side2);
        System.out.println("");
        System.out.printf("Hypothenuse = %.2f", h);
        System.out.println("");
        
    }
}
