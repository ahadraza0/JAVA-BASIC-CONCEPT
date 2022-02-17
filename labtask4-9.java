import java.util.Scanner;
public class NewClass
{
      public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your days:");
        int days = sc.nextInt();
        int years = days/365;
        int week = days/7;
        int month = days/12;
        System.out.println("your days convert into years:"+ years);
        System.out.println("your days convert into week:"+ week);
        System.out.println("your days convert into month:"+ month);

    }
}