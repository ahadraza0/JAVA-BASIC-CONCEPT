import java.util.Scanner;
public class NewClass 
{
      public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("enter the values of length:");
            int length = sc.nextInt();
            System.out.println("enter the value of width:");
            int width = sc.nextInt();
            System.out.println("the value of length is:"+ length);
            System.out.println("enter the value of width is:"+ width);
            float area =(float) (1/2*(length*width));
            System.out.println("the area of a triangle is:"+area);
        }
    }
}
