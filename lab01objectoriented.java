public class lab01objectoriented 
{
    private String booktitle;
    public void setbooktitle(String bt)
    {
        booktitle = bt;
    }
    private int bookpage;
    public void setbookpages(int pg)
    {
        bookpage = pg;
    }
    private int bookprice;
    public void setbookprice(int pr)
    {
        bookprice = pr;
    }
    public void showdetail()
    {
        System.out.println("the book title is:"+ booktitle);
        System.out.println("the book pages is:"+ bookpage);
        System.out.println("the book price is:"+ bookprice);
    }
}
