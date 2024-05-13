import java.util.*;
class abav
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the days :");
        int n=sc.nextInt();
        int a=1,b=0,c=0;
        if(n>0&&n<=30){
        for(int i=1; i<=n; i++)  
        {  
            c= a + 2 * b;  
            a = b;  
            b= c;  
        }  
        System.out.println("Number of eggs laid in the "+n+"th day is "+c);
        } 
        else{
        System.out.println(n+" is an Invalid day");
        }
    }
}
