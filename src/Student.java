/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
public class Student {
    private String name;
    private double score;
    public Student(String inName, double inScore)
    {
        name = inName;
        if (inScore >=0)
            score = inScore;
    }
    
    public Student()
    {
        name = "unknown";
        score = 0.0;
               
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getScore()
    {
        return score;
        
    }

    public void setName(String inName)
    {
       if (!inName.equals(""))
            name = inName;
    }
    
    public void setScore(double inScore)
    {
        if (inScore >=0)
            score = inScore;
    }
    
    public String toString()
    {
           return name + " scored " + score;
    }

}
