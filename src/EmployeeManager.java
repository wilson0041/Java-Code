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
public class EmployeeManager {
    public static Employee emp1;
    public static Employee emp2;
    public static Scanner sc;
    public static void main(String[] args)
    {
        sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("Welcome to Snacks R Us Employee Management Program");
            System.out.println("Choose your option:");
            System.out.println("1.  Record employees");
            System.out.println("2.  Show employees");
            System.out.println("3.  Change employee information");
            System.out.println("4.  Record work done");
            System.out.println("5.  Check pay");
            System.out.println("6.  Issue cheques");
            System.out.println("7.  Quit");
            System.out.println("Your option? ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1: setUpEmployees(); break;
          	case 2: showEmployees(); break;
                case 3: changeInfo(); break;
          	case 4: recordWork(); break;
                case 5: checkPay(); break;
          	case 6: issueCheque(); break;
                case 7: System.out.println("Goodbye"); break;
          	default: System.out.println("Invalid option"); break;
            }
        }
        while (choice != 7);
    }
    public static void setUpEmployees()
    {
       System.out.println("You have only TWO employees");
       System.out.print("What is the name of employee 1 :");
       String name = sc.nextLine();
       System.out.print("What is the position :");
       String position = sc.nextLine();
       System.out.print("What is the hourlyPay :");
       double pay = sc.nextDouble();
       sc.nextLine();
       emp1 = new Employee(name, position, pay);
       System.out.print("What is the name of employee 2 :");
       name = sc.nextLine();
       System.out.print("What is the position :");
       position = sc.nextLine();
       System.out.print("What is the hourlyPay :");
       pay = sc.nextDouble();
       sc.nextLine();
       emp2 = new Employee(name, position, pay);
    }
    public static void showEmployees()
    {
        System.out.println(emp1.toString());
        System.out.println();
        System.out.println(emp2.toString());
    }
    public static void changeInfo()
    {
        System.out.println("Do you want to change employee 1 or 2? ");
        int empNum = sc.nextInt();
        sc.nextLine();
        Employee wantedEmployee = null;
        if (empNum == 1)
            wantedEmployee = emp1;
        else if (empNum == 2)
            wantedEmployee = emp2;
        if (wantedEmployee != null)
        {
            System.out.println(wantedEmployee.toString());
            System.out.println("Do you want to change: ");
            System.out.println("1.  name");
            System.out.println("2.  position");
            System.out.println("3.  hourly pay");
            System.out.println("Enter option to change: ");
            int option = sc.nextInt();
            sc.nextLine();
            if (option == 1)
            {
                System.out.println("Enter new name: ");
                String name = sc.nextLine();
                wantedEmployee.setName(name);
            }
            if (option == 1)
            {
                System.out.println("Enter new position: ");
                String position = sc.nextLine();
                wantedEmployee.setPosition(position);
            }
            if (option == 1)
            {
                System.out.println("Enter new hourly pay: ");
                double hourlyPay = sc.nextDouble();
                wantedEmployee.setHourlyPay(hourlyPay);
            }
            else
                System.out.println("Invalid option");
        }
        else
            System.out.println("Invalid option");
    }
    public static void recordWork()
    {
        System.out.println("Do you want to record employee 1 or 2? ");
        int empNum = sc.nextInt();
        sc.nextLine();
        Employee wantedEmployee = null;
        if (empNum == 1)
            wantedEmployee = emp1;
        else if (empNum == 2)
            wantedEmployee = emp2;
        if (wantedEmployee == null)
            System.out.println("Invalid choice");
        else
        {
            System.out.println("Enter number of hours of work: ");
            int hours = sc.nextInt();
            while (hours < 0)
            {
                System.out.println("Hours must be positive");
                System.out.println("Please re-enter: ");
                hours = sc.nextInt();
            }
            sc.nextLine();
            wantedEmployee.recordWork(hours);
        }
    }
    public static void checkPay()
    {
        System.out.println("Employee    Pay Due");
        System.out.println(emp1.getName() + "\t" + emp1.calculatePayDue());
        System.out.println(emp2.getName() + "\t" + emp2.calculatePayDue());
    }
    public static void issueCheque()
    {
        System.out.println(emp1.issuePayCheque());
        System.out.println(emp2.issuePayCheque());
    }
}
