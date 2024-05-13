/*write a program to print the length of a string*/

import java.util.*;
public class program1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s=sc.next();
        int n=s.length();
        System.out.println("Length of String is : "+n);
    }
}