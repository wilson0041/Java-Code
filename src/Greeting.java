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
public class Greeting {
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = kbd.nextLine();
        System.out.print("How old are you? ");
        int age = kbd.nextInt();
        kbd.nextLine();
        int firstDigit = age /10;
        System.out.println("Hello, " + name + ". You are in your " + firstDigit + "0's");
    }
}
