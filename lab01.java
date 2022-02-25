//1. Take an integer from user as input and check whether the given value is even or not?
import java.util.Scanner;
public class lab01 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int number = sc.nextInt();
        if(number%2==0)
        {
            System.out.println(number + (" is even number"));
        }
        else
        {
            System.out.println(number +(" is odd number"));
        }
    }
}
