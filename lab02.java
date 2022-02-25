//2. Write a code for switch case in which if user presses 1, it should print "It is odd" and if user presses 
//2, it should print "It is even". The program should quit otherwise.
import java.util.Scanner;
public class lab02
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter your number");
        int number  = sc.nextInt();
        switch(number)
        {
            case 1:
                System.out.println("It is odd number");
                break;
            case 2:
                System.out.println("It is even number");
                break;
            default:
                System.out.println("invalid number");
        }
    }
}
