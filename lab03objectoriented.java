public class lab03objectoriented 
{
    private int accountbalance;
    public void setamountbalance(int at)
    {
        accountbalance = at;
    }
    private int depositamount;
    public void setdepositamounnt(int dm)
    {
        depositamount = dm;
    }
    private int withdrawamount;
    public void setwithdrawamount(int dwm)
    {
        withdrawamount = dwm;
    }
    public void showdetail()
    {
        System.out.println("your account balacne is:"+ accountbalance);
        System.out.println("your deposit amount is:"+ depositamount);
        System.out.println("your withdraw amount is:"+ withdrawamount);
    }      
}
