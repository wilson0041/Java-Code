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
public class NutritionAdvisor {
    static Scanner sc;
    public static void main(String[] args)
    {
        sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("Please enter your height in meters: ");
        double height = sc.nextDouble();
        sc.nextLine();
        System.out.print("Please enter your weight in kg: ");
        double weight = sc.nextDouble();
        sc.nextLine();
        double BMI = Health.getBMI(height, weight);
        String bodyType = Health.getBodyType(BMI);
        System.out.println("Thank you. \nYour BMI value is " + BMI);
        System.out.println("You are " + bodyType);
        
    }
}
