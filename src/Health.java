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
public class Health {
    public static double getBMI(double height, double weight)
    {
        return weight / (height * height);
    }
    public static String getBodyType(double BMI)
    {
        if (BMI < 18.5)
            return "Underweight";
        else if (BMI >= 18.5 && BMI <= 24.9)
            return "Normal weight";
        else if (BMI >= 25 && BMI <= 29.9)
            return "Overweight";
        else
            return "Obese";
    }
    public static double getBMR(char gender, int age, double weight, double height)
    {
        if (gender == 'F' || gender == 'f')
        {
            return 65 + 9.6 * weight + 1.8 * height * 100 - 4.7 * age;
        }
        else if (gender == 'M' || gender == 'm')
        {
            return 66 + 13.7 * weight + 5 * height * 100 - 6.8 * age;
        }
        else
        {
            return 0;
        }
    }
    public static double getCalorie(double BMR, int level)
    {
        switch (level)
        {
            case 1:
                return BMR * 1.2;
            case 2:
                return BMR * 1.375;
            case 3:
                return BMR * 1.55;
            case 4:
                return BMR * 7.725;
            default:
                return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Key in your height: ");
        double h = sc.nextDouble();
        System.out.print("Key in your weight: ");
        double w = sc.nextDouble();
        System.out.print("Key in your age: ");
        int a = sc.nextInt();
        System.out.print("Key in your gender: ");
        char g = sc.next().charAt(0);
        System.out.print("Your level of activity? ");
        int level = sc.nextInt();
        double BMI = getBMI(h, w);
        double BMR = getBMR(g, a, w, h);
        double calorieNeeds = getCalorie(BMR, level);
        System.out.printf("Your height %.2fm and weight %.2fkg", h, w);
        System.out.println("");
        System.out.printf("You have a BMI of %.2f", BMI);
        System.out.println("");
        String bodyType = getBodyType(BMI);
        System.out.println("You are " + bodyType);
        System.out.printf("You have BMR of %.2f", BMR);
        System.out.println("");
        System.out.printf("Your daily calorie needed is %.2f", calorieNeeds);
        System.out.println("");
    }
}
