/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
public class TestRectangle {
    public static void main(String[] args)
    {
        Rectangle sc = new Rectangle();
        Rectangle cs = new Rectangle(5.2, 6.9);
        sc.setLength(1.3);
        sc.setWidth(1.4);
        System.out.println("The perimeter for first rectangle is " + sc.perimeter());
        System.out.println("The perimeter for second rectangle is " + cs.perimeter());
        if (sc.area() > cs.area())
            System.out.println(sc.toString());
        else
            System.out.println(cs.toString());
    }
}
