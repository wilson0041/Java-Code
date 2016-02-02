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
public class NumberDay {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (0..6)? ");
        int num = sc.nextInt();
        if (num >= 0 && num <= 6)
        {
            switch (num)
            {
                case 0:
                    System.out.printf("%d --> Sunday", num);
                    break;
                case 1:
                    System.out.printf("%d --> Monday", num);
                    break;
                case 2:
                    System.out.printf("%d --> Tuesday", num);
                    break;
                case 3:
                    System.out.printf("%d --> Wednesday", num);
                    break;
                case 4:
                    System.out.printf("%d --> Thursday", num);
                    break;
                case 5:
                    System.out.printf("%d --> Friday", num);
                    break;
                case 6:
                    System.out.printf("%d --> Saturday", num);
                    break;
            }
        }
        else
        {
            System.out.printf("%d --> Invalid integer!", num);
        }
        System.out.println("");
    }
}
