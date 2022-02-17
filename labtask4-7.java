import java.util.Scanner;
public class NewClass
{
      public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you the value of radius");
        int radius = sc.nextInt();
        float area = (float) (Math.PI*radius*radius);
        System.out.println("the area of the circle is:"+ area);
    }
}