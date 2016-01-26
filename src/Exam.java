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
public class Exam {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double finalMark;
        char grade;
        System.out.print("Enter the assignment 1 marks: ");
        double assign1 = sc.nextDouble();
        if (assign1 >= 0 && assign1 <= 100)
        {
            System.out.print("Enter the assignment 2 marks: ");
            double assign2 = sc.nextDouble();
            sc.nextLine();
            if (assign2 >= 0 && assign2 <= 100)
            {
                System.out.print("Enter the exam marks: ");
                double exam = sc.nextDouble();
                sc.nextLine();
                if (exam >= 0&& exam <= 100)
                {
                    finalMark = assign1 / 4 + assign2 / 4 + exam / 2;
                    System.out.printf("Your final mark is %.2f", finalMark);
                    System.out.println("");
                    if (finalMark >= 50)
                    {
                        System.out.println("You pass.");
                        if (finalMark >= 90)
                            grade = 'A';
                        else if (finalMark <= 75 || finalMark < 90)
                            grade = 'B';
                        else if (finalMark <= 65 || finalMark < 75)
                            grade = 'C';
                        else
                            grade = 'D';
                    }
                    else
                    {
                        System.out.println("You fail.");
                        if (finalMark >= 40)
                            grade = 'E';
                        else
                            grade = 'F';
                    }
                    System.out.println("Your grade is " + grade);
                    switch (grade)
                    {
                        case 'A':
                            System.out.println("Excellent!");
                        case 'B':
                            System.out.println("Well done!");
                            break;
                        case 'C': case 'D':
                            System.out.println("Try harder");
                            break;
                        case 'F':
                            System.out.println("Ask for help!");
                        case 'E':
                            System.out.println("That's too bad");
                            break;
                    }
                }
                else
                    System.out.println("Invalid mark entered");
            }
            else
                System.out.println("Invalid mark entered");
        }
    }
}
