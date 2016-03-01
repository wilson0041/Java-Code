/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
public class Rectangle {
    private double length;
    private double width;
    public Rectangle()
    {
        length = 0.0;
        width = 0.0;
    }
    public Rectangle(double inLength, double inWidth)
    {
        if (inLength > 0)
            length = inLength;
        else
            length = 0.0;
        if (inWidth > 0)
            width = inWidth;
        else
            width = 0.0;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public void setLength(double inLength)
    {
        if (inLength >= 0)
            length = inLength;
    }	
    public void setWidth(double inWidth)
    {
        if (inWidth >= 0)
            width = inWidth;
    }
    public double area()
    {
        return length * width;
    }
    public double perimeter()
    {
        return length * 2 + width * 2;
    }
    public String toString()
    {
        return "Rectangle width = " + width + " and length = " + length;
    }
}
