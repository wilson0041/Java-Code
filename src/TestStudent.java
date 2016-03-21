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
public class TestStudent {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students do you have?");
        int num = sc.nextInt();
       
        while (num <=0)
        {
            System.out.println("You must have at least 1 student");
            num = sc.nextInt();
        }
        sc.nextLine();
         
        Student [] st = new Student[num];
       
        for (int i = 0; i < st.length; i++)
        {
            System.out.print("Enter student " + (i+1) + " name :");
            String name = sc.nextLine();
            System.out.print("Enter score for " + name + " :");
            double score = sc.nextDouble();
            sc.nextLine();
            st[i] = new Student(name, score);
        }
        
        double total = 0.0;
        for (int i = 0; i < st.length; i++)
        {
            total += st[i].getScore();
        }
        double ave = total / st.length;
        
        System.out.println("The total marks is " + total);
        System.out.println("Average score is " + ave);

        Student bestStudent = st[0];
        for (int i = 1; i < st.length; i++)
        {
            if (st[i].getScore()> bestStudent.getScore())
                bestStudent = st[i];
        }
        
        System.out.println("The best student is ");
        System.out.println(bestStudent.toString());
        
    }
}