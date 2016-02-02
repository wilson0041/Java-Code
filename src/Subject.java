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
public class Subject {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double passPercent, failPercent, absenteePercent;
        System.out.print("Enter subject code (e.g. BIT100): ");
        String subjectCode = sc.nextLine();
        System.out.print("Enter subject name (e.g. Python Programming): ");
        String subjectName = sc.nextLine();
        System.out.print("Number of passes: ");
        int passNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Number of failures: ");
        int failNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Number of absentees: ");
        int absenteeNo = sc.nextInt();
        sc.nextLine();
        passPercent = passNo / (passNo + failNo + absenteeNo) * 100;
        failPercent = failNo / (passNo + failNo + absenteeNo) * 100;
        absenteePercent = absenteeNo / (passNo + failNo + absenteeNo) * 100;
        System.out.printf("For the exam of %s %s", subjectCode, subjectName);
        System.out.printf("Percentage of passes: %.1f %", passPercent);
        System.out.printf("Percentage of failures: %.1f %", failPercent);
        System.out.printf("Percentage of absentees: %.1f %", absenteePercent);
        System.out.println("");
        
    }
}
