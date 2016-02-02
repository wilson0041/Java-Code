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
public class centiMeter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int meter, centiRemain;
        System.out.print("Enter a length in centimeter: ");
        int centi = sc.nextInt();
        meter = centi / 100;
        centiRemain = centi % 100;
        System.out.printf("%d cm = %d m and %d cm", centi, meter, centiRemain);
        System.out.println("");
    }
}
