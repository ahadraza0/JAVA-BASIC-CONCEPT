public class lab02procedural 
{
    static int accountbalance;
    public static void setaccountbalance(int account)
    {
        accountbalance = account;
    }
    public static void showaccountbalacne()
    {
        System.out.println("the account balance:"+ accountbalance);
    }
    public static void main(String[] args)
    {
        setaccountbalance(15000);
        showaccountbalacne();
    }
}
