/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
public class RandomAddition {
    public static void main(String[] args)
    {
        int num1 = (int) (Math.random() * 11), num2 = (int) (Math.random() * 11), total = (int) (Math.random() * 20) + 1;
        System.out.printf("What is %d + %d? %d", num1, num2, total);
        System.out.println("");
        if (num1 + num2 == total)
            System.out.println("Your number is correct!");
        else
        {
            System.out.printf("Oops! The answer is %d", (total = num1 + num2));
            System.out.println("");
        }
    }
}
