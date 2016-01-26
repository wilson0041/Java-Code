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
public class squareRoot {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Number to be square root: ");
        x = sc.nextInt();
        System.out.printf("Square root of %d is %.2f", x, Math.sqrt(x));
        System.out.println("");
    }
}
