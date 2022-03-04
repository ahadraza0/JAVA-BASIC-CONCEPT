public class lab03procedural 
{
    static int accountbalance;
    public static void setaccountbalance(int account)
    {
        accountbalance = account;
    }
    static int deposit;
    public static void setamountdeposit(int dp)
    {
        deposit = dp;
    }
    static int drawamount;
    public static void setwithdrawamount(int dw)
    {
        drawamount = dw;
    }
    public static void showaccountbalacne()
    {
        System.out.println("the account balance:"+ accountbalance);
        System.out.println("the deposit amount is:"+ deposit);
        System.out.println("the withdraw amount is"+ drawamount);
    }
    public static void main(String[] args)
    {
        setaccountbalance(15000);
        setamountdeposit(5000);
        setwithdrawamount(5000);
        showaccountbalacne();
    }
}
