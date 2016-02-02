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
public class StreetSurvey {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rm70, rm10;
        double paidAmount;
        System.out.print("Number of surveys? ");
        int survey = sc.nextInt();
        rm70 = survey / 5;
        rm10 = survey % 5;
        paidAmount = rm70 * 70 + rm10 * 10;
        System.out.printf("You earned %.1f", paidAmount);
        System.out.println("");
    }
}
