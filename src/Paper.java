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
public class Paper {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double length, width, area;
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
        sc.nextLine();
        area = length * width;
        System.out.printf("The area of an %.2f cm x %.2f cm size paper is %.2f square cm", length, width, area);
        System.out.println("");
    }
}
