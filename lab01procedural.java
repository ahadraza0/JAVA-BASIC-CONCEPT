import java.util.Scanner;
public class lab01procedural
{
    public static void settitleofbook()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the title of the book is:");
        String book = sc.next();
        System.out.println("your book title is:"+ book);
    }
    public static void setpriceofbook()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the price of the book:");
        int price = sc.nextInt();
        System.out.println("thr price of the book is:" + price +("rs"));
    }
    public static void setnumberofpages()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many pages of the book is:");
        int pages = sc.nextInt();
        System.out.println("the total pages of the book is:"+ pages);
    }
    public static void main(String[] args)
    {
        settitleofbook();
        setpriceofbook();
        setnumberofpages();
    }
}
