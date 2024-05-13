/*Longest and Least Length word in a sentence*/
import java.util.Scanner;
public class program{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s=sc.nextLine();
        String smax,smin,w=" ";
        int x;
        char ch;
        smax=smin=s.substring(0,s.length());
        s+=" ";
        for(x=0;x<=s.length();x++)
        {
            ch=s.charAt(x);
            if(x!=' ')
            {
                w+=ch;
            }
            else
            {
                if(smax.length()<w.length())
                {
                    smax=w;
                }
                if(smin.length()>w.length())
                {
                    smin=w;
                    w=" ";
                }
            }
        }
        System.out.print(smax+" "+smin);

    }
    
}