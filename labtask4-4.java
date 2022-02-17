import java.util.Scanner;
public class NewClass
{
      public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your values in centimeter");
        float centimeter = sc.nextFloat();
        float meter = centimeter/100;
        System.out.println("centimeter convert into meter:"+ meter);
    }
}