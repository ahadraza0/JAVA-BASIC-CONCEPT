public class lab01procedural
{
    static String booktitle;
    
    public static void setbooktitle(String title)
    {
        booktitle = title;      
    }
    static int bookpages;
    
    public static void setbookpages(int pages)
    {
        bookpages = pages;
    }
    static int bookprice;
   
    public static void setprice(int price)
    {
        bookprice = price;
    }
    
    public static void showdetail()
    {
        System.out.println("the book title is:"+ booktitle);
        System.out.println("the book pages is:"+ bookpages);
        System.out.println("the book price is:"+ bookprice);
    }
    public static void main(String[] args)
    {
        setbooktitle("JAVA HOW TO PROGRAM");
        setbookpages(1200);
        setprice(395);
        showdetail();
    }
}


