/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
public class TestPhone {
    public static void main(String[] args)
    {
        PhoneCard pc = new PhoneCard("012-5201314", 5.00);
        System.out.println("New pgone card: " + pc.toString());
        boolean status = pc.makeCall(20, 0.30);
        if (status == true)
            System.out.println("Call successfully");
        else
            System.out.println("Call failed");
        System.out.println("The balance is " + pc.getBalance());
        pc.topUp(10);
        System.out.println("The balance is NOw " + pc.getBalance());
    }
}
