import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("enter the value of b:");
        int b = sc.nextInt();
        int sum = a+b;
        int sub = a-b;
        int product = a*b;
        int divide = a/b;
        int average = sum/2;
        System.out.println("which operator you want to use it ?");
        char operator = sc.next().charAt(0);
        switch(operator)
        {
            case '+':
                System.out.println("the sum of two value is:"+ sum);
                break;
            case '-':
                System.out.println("the sub of two value is:"+ sub);
                break;
            case '*':
                System.out.println("the product of two value is:"+ product);
                break;
            case '/':
                System.out.println("the divide of two value is:"+ divide);
                break;
            case '%':
                System.out.println("the average of two value is:"+ average);
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
