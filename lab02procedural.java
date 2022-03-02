import java.util.Scanner;
public class lab02procedural 
{
    public static void setaccountbalance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("the account balance:");
        int accountbalance = sc.nextInt();
    }
    public static void setshowsbalance()
    {
        int accountbalance;
         System.out.println("the amount in your account balance is"+ ("rs"));        
    }
    public static void main(String[] args)
    {
        setaccountbalance();
        setshowsbalance();
    }
}

