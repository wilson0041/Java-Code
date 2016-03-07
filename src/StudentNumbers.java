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
public class StudentNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int stuNum, i = 0;
        do
        {
            System.out.print("Enter student number (0 to stop): ");
            stuNum = sc.nextInt();
            if (stuNum >= 1000 && stuNum <= 9999)
                i++;
            else if (stuNum == 0)
                i = i;
            else
                System.out.println("Please value between 1000 to 9999");
                i = i;
        }
        while (stuNum != 0);
        System.out.println("Number of students = " + i);
    }
}
