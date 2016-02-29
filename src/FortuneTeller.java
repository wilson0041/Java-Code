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
public class FortuneTeller {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char answer;
        System.out.println("Welcome to the Madam Zorra's hut...");
        do
        {
            System.out.println("Enter your question: \n");
            sc.nextLine();
            int choice = (int) (Math.random() * 4 + 1);
            if (choice == 1)
            {System.out.println("The answer is: Of course not");}
            else if (choice == 2)
            {System.out.println("The answer is: Yes, definitely");}
            else if (choice == 3)
            {System.out.println("The answer is: Not now, but in the future");}
            else
            {System.out.println("The answer is: With a bit of hard work");}
            System.out.println("");
            System.out.println("Do you want to ask another question? Y/N: ");
            answer = sc.nextLine().charAt(0);
            while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n')
            {
                System.out.println("Please answer Y or N");
                System.out.print("Do you want to ask another question?");
                answer = sc.nextLine().charAt(0);
            }
        }
        while (answer == 'Y' || answer == 'y');
        System.out.println("");
        System.out.println("Good bye!");
    }
}
