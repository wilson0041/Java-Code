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
public class ExamReport {
    public static void main(String[] args)
    {
        char yY;
        int pass = 0, fail = 0;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter subject code");
            String code = sc.nextLine();
            double mark, total = 0.0, highest = 0;
            System.out.println("How many students are there in " + code + ":");
            int num = sc.nextInt();
            for (int count = 1; count <= num; count += 1)
            {
                do
                {
                System.out.println("Enter mark for student " + count);
                mark = sc.nextDouble();
                if (mark < 0 || mark > 100)
                {
                    System.out.println("Invalid marks entered");
                }
                }
                while (mark < 0 || mark > 100);
                if (mark > highest)
                {
                    highest = mark;
                }
                total += mark;
                if (mark >= 50)
                    pass += 1;
                else
                    fail += 1;
            }
            double average = total / num;
            System.out.printf("For %s the average mark of %d students is %.2f %n", code, num, average);
            System.out.printf("Highest mark is %.2f", highest);
            System.out.println("");
            System.out.println("Do you wish to continue with another subject?");
            yY = sc.next().charAt(0);
        }
        while (yY == 'Y' || yY == 'y');
        System.out.println("Number of pass: " + pass);
        System.out.println("Number of fail: " + fail);
        
    }
}
