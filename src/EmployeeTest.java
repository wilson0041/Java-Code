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
public class EmployeeTest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee emp = null;
        System.out.println(emp);
        Employee e1 = new Employee();
        System.out.println("Employee 1 is " + e1.toString());
        System.out.println("For another employee");
        System.out.print("What is the name: ");
        String name = sc.nextLine();
        System.out.print("What is the position: ");
        String position = sc.nextLine();
        System.out.print("What is the hourly pay: ");
        double pay = sc.nextDouble();
        sc.nextLine();
        Employee e2 = new Employee(name, position, pay);
        System.out.println("Employee 2 is " + e2.toString());
        System.out.println("For another employee");
        System.out.print("What is the name: ");
        name = sc.nextLine();
        e1.setName(name);
        System.out.print("What is the position: ");
        position = sc.nextLine();
        e1.setPosition(position);
        System.out.print("What is the hourly pay: ");
        pay = sc.nextDouble();
        e1.setHourlyPay(pay);
        sc.nextLine();
        System.out.println("Employee 1 is now " + e1.toString());
        System.out.println("The higher pay employee is ");
        if (e1.getHourlyPay() > e2.getHourlyPay())
            System.out.println(e1.getName() + " " + e1.getPosition());
        else
            System.out.println(e2.getName() + " " + e2.getPosition());
    }
}
