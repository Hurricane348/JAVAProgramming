import java.util.*;
public class abc{
    public static void main()
    {
    Scanner sc = new Scanner(System.in);
    double fit=0;
    System.out.println("Enter weigth in kg");
    double kg=sc.nextDouble();
    System.out.println("Enter height in cm");
    double cm=sc.nextDouble();
    double bmi=kg/((cm/100)*(cm/100));
    System.out.printf("Your BMI is %.02f",bmi);
    if(bmi>=25){
        fit=bmi-25;
        System.out.printf(". You are overweight reduce %.02f",fit);
        System.out.printf(" kg to be fit");
    }
    else if(bmi <=25 && bmi >=18.5)
    {
        System.out.printf(". You are fit and healthy");
    }
    else 
    {
        fit=18.5-bmi;
        System.out.printf(". You are underweight gain %.02f",fit);
        System.out.printf(" kg to be fit");
    }
    }
}