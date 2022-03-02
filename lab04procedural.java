import java.util.Scanner;
public class lab04procedural 
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
    public static void setwithdraw()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("the amount you want to withdram is:");
        int draw = sc.nextInt();
        System.out.println("withdraw amount is:" + draw + ("RS"));
    }
    public static void setdeposit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("how much amount you want to deposit:");
        int deposit = sc.nextInt();
        System.out.println("your deposit amount is:" + deposit + ("RS"));
    }
    public static void main(String[] args)
    {
        setaccountbalance();
        setwithdraw();
        setdeposit();
    }
}

