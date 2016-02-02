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
public class Speed {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance travelled in km: ");
        double distance = sc.nextDouble();
        System.out.print("Enter the time taken in hour: ");
        double time = sc.nextDouble();
        double averageSpeed = distance / time;
        System.out.printf("The average speed is %.2f km/hr", averageSpeed);
        System.out.println("");
    }
}
