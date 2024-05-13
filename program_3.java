/* Substring part 2*/
//import java.util.*;
import java.util.Scanner;
public class program_3
{
        public static void main()
        {
         Scanner sc = new Scanner(System.in);   
         System.out.print("Enter a String : ");
         String s=sc.next();
         int n=s.length();
         String x=s.substring(4,n);
         System.out.println("Substring of String is : "+x);
        }   
}