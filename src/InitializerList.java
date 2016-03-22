/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson5801
 */
public class InitializerList {
    public static void main(String[] args)
    {
        String[] name = {"Aidan", "Steven", "Shen", "Wilson", "Fan"};
        String longestName = name[0];
        String shortestName = name[0];
        int totalLength = name[0].length();
        for (int i = 1; i < name.length; i++)
        {
            totalLength += name[i].length();
            if (name[i].length() > longestName.length())
                longestName = name[i];
            if (name[i].length() < shortestName.length())
                shortestName = name[i];
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Shortest name: " + shortestName);
    }
}
