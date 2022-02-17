//2.Write C++ Program that take 2 integer values from user to perform arithmetic operation by using 
//all mathematic Operations also print the result on screen
import java.util.Scanner;
public class hello
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("enter the values of a:");
            int a = sc.nextInt();
            System.out.println("enter the value of b:");
            int b = sc.nextInt();
            System.out.println("the value of a is:"+ a);
            System.out.println("enter the value of b is:"+ b);
            int sum = a+b;
            int sub = a-b;
            int product = a*b;
            float divide = a/b;
            float average = sum/2;
            System.out.println("the sum of two value is:"+ sum);
            System.out.println("the sub of two values is:"+ sub);
            System.out.println("the product of two values is:"+ product);
            System.out.println("the divide of the two values is:"+ divide);
            System.out.println("the average of your values is:"+ average);
        }
    }
}
