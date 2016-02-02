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
public class CDR {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantity of CD-R disks? ");
        int quantity = sc.nextInt();
        if (quantity > 0)
        {
            System.out.println("Unit price: RM5.8");
            double unitPrice, discount, amountPaid, discountPrice, beforeDiscount;
            unitPrice = 5.8;
            System.out.println("Quantity bought: " + quantity);
            beforeDiscount = unitPrice * quantity;
            if (quantity >= 6 && quantity <=20)
            {
                discount = 0.1;
                discountPrice = (discount * beforeDiscount);
                amountPaid = beforeDiscount - discountPrice;
                System.out.println("Discount: RM" + discountPrice);
                System.out.println("Amount paid: RM" + amountPaid);
            }
            else if(quantity > 20)
            {
                discount = 0.15;
                discountPrice = (discount * beforeDiscount);
                amountPaid = beforeDiscount - discountPrice;
                System.out.println("Discount: RM" + discountPrice);
                System.out.println("Amount paid: RM" + amountPaid);
            }
            else
            {
                discount = 0.0;
                discountPrice = (discount * beforeDiscount);
                amountPaid = beforeDiscount - discountPrice;
                System.out.println("Discount: RM" + discountPrice);
                System.out.println("Amount paid: RM" + amountPaid);
            }
        }
        else
        {
            System.out.println("Invalid quantity.");
        }
    }
}
