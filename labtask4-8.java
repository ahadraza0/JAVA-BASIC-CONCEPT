import java.util.Scanner;
public class NewClass
{
      public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your marks of subject1:");
        int subject1 = sc.nextInt();
        System.out.println("enter your marks of subject2");
        int subject2 = sc.nextInt();
        System.out.println("enter your makrs of subject3");
        int subject3 = sc.nextInt();
        int sum = subject1+subject2+subject3;
        int average = sum/3;
        System.out.println("the average of your marks is:"+ average);
    }
}