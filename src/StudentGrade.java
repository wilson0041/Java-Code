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
public class StudentGrade {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();
        System.out.print("Enter his/her grade (e.g. A): ");
        char grade = sc.nextLine().charAt(0);
        System.out.println(name + "\t" + grade);
        
    }
}
