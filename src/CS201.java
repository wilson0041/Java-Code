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
public class CS201 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int idNo, tutMark, assign1Mark, assign2Mark, examMark;
        double finalMark;
        do
        {
            System.out.print("Enter student idno: ");
            idNo = sc.nextInt();
            if (idNo != 0)
            {
                System.out.print("Enter the raw mark for tutorials: ");
                tutMark = sc.nextInt();
                System.out.print("Enter the raw mark for assignment 1: ");
                assign1Mark = sc.nextInt();
                System.out.print("Enter the raw mark for assignment 2: ");
                assign2Mark = sc.nextInt();
                System.out.print("Enter the raw examination mark: ");
                examMark = sc.nextInt();
                finalMark = tutMark * 0.1 + assign1Mark * 0.1 + assign2Mark * 0.1 + examMark * 0.7;
                System.out.printf("The final mark for student %d: %.1f", idNo, finalMark);
                System.out.println("");
                if (finalMark >= 90 && finalMark <= 100)
                {System.out.printf("The grade for student %d    : A", idNo);}
                else if (finalMark >= 80 && finalMark <= 90)
                {System.out.printf("The grade for student %d    : B", idNo);}
                else if (finalMark >= 70 && finalMark <= 80)
                {System.out.printf("The grade for student %d    : C", idNo);}
                else if (finalMark >= 60 && finalMark <= 70)
                {System.out.printf("The grade for student %d    : D", idNo);}
                else
                {System.out.printf("The grade for student %d    : F", idNo);}
                System.out.println("\n");    
            }
        }
        while (idNo != 0);
    }
}
