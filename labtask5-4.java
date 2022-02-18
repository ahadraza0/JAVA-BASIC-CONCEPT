import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        if(a>=0)
        {
            System.out.println(a + "is the positive number");
        }
        else
        {
            System.out.println(a + "is the negative number");
        }
    }
}
