import java.util.Scanner;  
public class PellNumberExample  
{  
public static void main(String args[])  
{  
int n, limit, a=1, b=0, c;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the limit: ");  
limit=sc.nextInt();  
System.out.println("First "+limit+" Pell numbers are: ");  
for(n=1; n<=limit; n++)  
{  
c= a + 2 * b;  
System.out.print(c+" ");  
a = b;  
b = c;  
}  
}  
}  