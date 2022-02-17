import java.util.Scanner;
public class NewClass
{
      public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("enter the values of a:");
            int a = sc.nextInt();
            System.out.println("enter the value of b:");
            int b = sc.nextInt();
            int c;
            c=a;
            a=b;
	        b=c;
            System.out.println("now the value of a is:"+ a);
            System.out.println("now  the value of b is:"+ b);
        }
    }
}
