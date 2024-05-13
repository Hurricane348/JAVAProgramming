/*write a program to print the substring of a string */

import java.util.*;
public class program_2
{ 
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s=sc.next();
        String s1=s.substring(2);
        System.out.println("Substring of the inputted String is : "+s1);
    }
}