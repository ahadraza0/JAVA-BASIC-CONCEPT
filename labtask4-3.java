import java.util.Scanner;
public class NewClass
{
      public static void main(String[] args)
    {
        int number = 57;
        number++;
        System.out.println("after post increment by 1 the number is:"+ number);
        ++number;
        System.out.println("after pre increment by 1 the number is:"+ number);
        number = number + 1;
        System.out.println("after incresing by 1 the number is:"+ number);
        //
         number--;
        System.out.println("after post decrement by 1 the number is:"+ number);
        --number;
        System.out.println("after pre decrement by 1 the number is:"+ number);
        number = number - 1;
        System.out.println("after decrement by 1 the number is:"+ number);

    }
}