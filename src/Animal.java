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
public class Animal {
    public static void animalSound(String animalName, String sound)
    {
	System.out.println("Old McDonald had a farm");
	System.out.println(eieio());
	System.out.println("and on his farm he had a " + animalName);
	System.out.println(eieio());
	System.out.println("with a " + sound + ", " + sound + " here ");
	System.out.println("and a " + sound + ", " + sound + " there ");
	System.out.println("here a " + sound + ", there a " + sound + ",");
	System.out.println("Everywhere a " + sound + ", " + sound );
        System.out.println("Old McDonald had a farm");
	System.out.println(eieio());
    }
    public static String eieio()
    {
            return "E-I-E-I-O!!!";
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String sound = "";
        System.out.print("What animal you want to sound? ");
        String animalName = sc.nextLine();
        if ("cat".equals(animalName))
            sound = "meow";
        if ("dog".equals(animalName))
            sound = "woof";
        if ("duck".equals(animalName))
            sound = "quack";
        if ("cow".equals(animalName))
            sound = "moo";
        if ("programmer".equals(animalName))
            sound = "yippee";
        animalSound(animalName, sound);
        
    }
}
