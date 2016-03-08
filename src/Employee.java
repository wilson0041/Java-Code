/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
public class Employee {
    private String name;
    private String position;
    private double hourlyPay;
    private int hoursWorked;
    public Employee()
    {
        name = "not set";
        position = "not set";
        hourlyPay = 0.0;
        hoursWorked = 0;
    }
    public Employee(String nameIn, String positionIn, double hourlyPayIn, int hoursWorkedIn)
    {
        if (!nameIn.equals(""))
            name = nameIn;
        else
            name  = "not set";
        if (!positionIn.equals(""))
            position = positionIn;
        else
            position  = "not set";
        if (hourlyPayIn > 0)
            hourlyPay = hourlyPayIn;
        else
            hourlyPay = 0.0;
        hoursWorked = 0;
    }

    Employee(String name, String position, double pay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getName()
    {
        return name;
    }
    public String getPosition()
    {
        return position;
    }
    public double getHourlyPay()
    {
        return hourlyPay;
    }
    public int getHoursWorked()
    {
        return hoursWorked;
    }
    public void setName(String nameIn)
    {
        if (!nameIn.equals(""))
            name = nameIn;
    }
    public void setPosition(String positionIn)
    {
        if (!positionIn.equals(""))    
            position = positionIn;
    }
    public void setHourlyPay(double hourlyPayIn)
    {
        if (hourlyPayIn > 0)
            hourlyPay = hourlyPayIn;
    }
    private void setHoursWorked(int hoursWorkedIn)
    {
        if (hoursWorkedIn > 0)
            hoursWorked = hoursWorkedIn;
    }
    @Override
    public String toString()
    {
        return name + ": " + position + " with hourly pay: " + hourlyPay + " worked " + hoursWorked + " this week.";
    }
    public void recordWork(int numHours)
    {
        if (numHours > 0)
            hoursWorked += numHours;
    }
    public double calculatePayDue()
    {
        return hourlyPay * hoursWorked;
    }
    public String issuePayCheque()
    {
        double payDue = calculatePayDue();
        setHoursWorked(0);
        return "Cheque with amount " + payDue + " issued to " + name;
        
    }
}
