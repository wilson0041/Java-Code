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
public class Addition {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, num1, num2, realAnswer, j = 0;
        for (i = 1; i <= 10; i++)
        {
            num1 = (int) (Math.random() * 10 + 1);
            num2 = (int) (Math.random() * 10 + 1);
            System.out.printf("What is %d + %d? ", num1, num2);
            int userAnswer = sc.nextInt();
            realAnswer = num1 + num2;
            if (userAnswer == realAnswer)
            {
                System.out.println("Your answer is correct!");
                j++;
            }
            else
            {
                System.out.printf("Oops! The answer is %d", realAnswer);
            }
            System.out.println("");
        }
        switch (j)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Please consult your teacher for revision!");
                break;
            case 5:
            case 6:
                System.out.println("Please revise your works.");
                break;
            case 7:
            case 8:
                System.out.println("Keep it up!");
                break;
            case 9:
            case 10:
                System.out.println("Excellent!");
                break;
        }
    }
}
