/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
public class loopSquareRoot {
    public static void main(String[] args)
    {
        int i;
        for (i = 100; i <= 200; i += 10)
        {
            System.out.printf("Square root of %d is %.3f", i, Math.sqrt(i));
            System.out.println("");
        }
    }
}
