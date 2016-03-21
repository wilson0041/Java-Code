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
public class ShoppingCentres
{
    public static int searchWord(String[] word, String wordToSearch)
    {
        for (int i = 0; i < word.length; i++)
            if (wordToSearch.equalsIgnoreCase(word[i]))
                return i;

        return -1;
    }
    
        public static void main(String[] args)
	{
                Scanner sc = new Scanner(System.in);
                String[] name = new String[5];
		System.out.println("Number of elements in array: " + 
			name.length);
		System.out.println("They are");
		for (int i=0; i<name.length; i++)
			System.out.println("\t" + name[i]);

		name[0] = new String("KLCC");
		name[1] = new String("Bangsar Shopping Centre");
		name[2] = new String("Sunway Pyramid ");
		name[3] = new String("Midvalley Megamall");
		name[4] = new String("1 Utama");

		System.out.println("\nNumber of elements in array: " + 
			name.length);
		System.out.println("They are");
		for (int i=0; i<name.length; i++)
			System.out.println("\t" + name[i]);
                
                System.out.print("What name? ");
                String friend = sc.nextLine();
                int found = searchWord (name, friend);
                if (found >= 0)
                    System.out.println("True");
                else
                    System.out.println("False");
                

	}
}


