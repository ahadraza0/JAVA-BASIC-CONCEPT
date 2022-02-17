import java.util.Scanner;
public class NewClass
{
      public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("enter the your temperature in fahrenheit:");
            float fahrenheit = sc.nextFloat();
            float celsius = (float) (5.0/9.0*(fahrenheit-32));
            System.out.println("celsius convert into fahrenheit:"+ celsius);
        }
    }
}
