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
public class Guess {
    public static void main(String[] args)
    {
        char again;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("I'm thinking of a number from 1 to 100. ");
            System.out.println("You have three tries to guess my number.");
            int user = 0, choice = (int) (Math.random() * 100 + 1);
            for (int guess = 1; guess <= 3; guess += 1)
            {
                System.out.print("Guess " + guess + " : ");
                user = sc.nextInt();
                if (user == choice)
                    System.out.println("Congratulation!");
                else
                {
                    if (user > choice)
                        System.out.println("Too high");
                    else
                        System.out.println("Too low");
                }
            }
            if (user != choice)
            {System.out.println("You lose! The answer is " + choice);}
            System.out.println("Do you want to play again?");
            again = sc.next().charAt(0);
        }
        while (again == 'Y' || again == 'y');
    }
}
