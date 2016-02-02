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
public class Dollar {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cent50, cent20, cent10, cent5, cent1;
        System.out.print("Enter money amount in dollars (e.g. 1.25) ");
        double dollar = sc.nextDouble();
        int cent;
        cent = (int) (dollar * 100);
        cent50 = cent / 50;
        cent20 = cent % 50 / 20;
        cent10 = cent % 50 % 20 / 10;
        cent5 = cent % 50 % 20 % 10 / 5;
        cent1 = cent % 50 % 20 % 10 % 5 / 1;
        System.out.printf("%d cents = %d \"50-cent\" %d \"20-cent\" %d \"10-cent\" %d \"5-cent\" %d \"1-cent\"", cent, cent50, cent20, cent10, cent5, cent1);
        System.out.println("");
    }
}
