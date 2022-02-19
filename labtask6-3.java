/*Lab Task 03: Write a menu driven program which has following options:
	1. Factorial
	2. Prime or not
	3. Odd or even
	4. Exit
Once a menu is selected, the appropriate action should be taken and once this action is finished, 
the menu should reappear. Unless the user selects the ‘Exit’ option the program should continue to work
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int factorial=1;
        System.out.println(" Menu driven program which has following options:");
        System.out.println("1. Factorial");
        System.out.println("2. Prime or not");
        System.out.println("3. Odd or even");
        System.out.println("4. Exit");
        System.out.println("which operator you like to use");
        int operator = sc.nextInt();
        System.out.println("enter your number:");
        int number = sc.nextInt();
        switch(operator)
        {
            case 1:
                for (int i = 1; i<=number; i++) 
            {
                 factorial = factorial*i;
            }
            System.out.println(factorial);
            break;
            case 3:
                if(number%2==0)
                {
                    System.out.println("even number");
                }
                else
                {
                    System.out.println("odd number");
                }
                break;
            case 4:
                System.out.println("exit");
                break;
            default:
                System.out.println("invalid operator");
                break;
        }
    }
}
