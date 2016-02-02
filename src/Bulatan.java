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
public class Bulatan {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle in cm: ");
        int r = sc.nextInt();
        double area, circumference;
        area = 3.142 * r * r;
        circumference = 2 * 3.142 * r;
        System.out.printf("The circumference of the circle is %.2f cm", circumference);
        System.out.println("");
        System.out.printf("The area of the circle is %.2f cm^2", area);
        System.out.println("");
        
    }
}
