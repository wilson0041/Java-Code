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
public class Time {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int hours, minutes, seconds, totalSeconds;
        System.out.print("Enter the time: ");
        totalSeconds = sc.nextInt();
        hours = totalSeconds / 60 / 60 % 60;
        minutes = totalSeconds / 60 % 60;
        seconds = totalSeconds % 60;
        System.out.printf("%d seconds = %d hours %d minutes %d seconds", totalSeconds, hours, minutes, seconds);
        System.out.println("");
    }
}
