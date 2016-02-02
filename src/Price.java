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
public class Price {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double finalPrice;
        System.out.print("Enter a price: RM");
        double oriPrice = sc.nextDouble();
        finalPrice = 0.9 * oriPrice;
        System.out.println("Discounted price: RM" + finalPrice);
    }
}
