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
public class Payroll {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pay rate: RM");
        double payRate = sc.nextDouble();
        System.out.print("Enter number of hours worked: ");
        int hoursWorked = sc.nextInt();
        double withholdingTax, grossPay, netPay;
        grossPay = payRate * hoursWorked;
        withholdingTax = grossPay * 0.15;
        netPay = grossPay - withholdingTax;
        System.out.println("The gross pay is RM " + grossPay);
        System.out.println("The withholding tax is RM " + withholdingTax);
        System.out.println("The net pay is RM " + netPay);
    }
}
