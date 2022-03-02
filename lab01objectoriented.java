import java.util.Scanner;
public class lab01objectoriented 
{
       public void setbooktitle()
       {
           Scanner sc = new Scanner(System.in);
           System.out.println("enter your book title:");
           String title = sc.next();
           System.out.println("the title of the book is:"+ title);
       }
       public void setbookpage()
       {
           Scanner sc = new Scanner(System.in);
           System.out.println("enter your book pages:");
           int pages = sc.nextInt();
           System.out.println("book total pages is:" + pages);
       }
       public void setbookprice()
       {
           Scanner sc = new Scanner(System.in);
           System.out.println("what is the price of the book:");
           int price = sc.nextInt();
           System.out.println("the price of the book is:"+ price);
       }
       public class Main
       {
        public static void main(String[] args)
        {
            lab01objectoriented c1 = new lab01objectoriented();
            c1.setbookpage();
            c1.setbookprice();
            c1.setbooktitle();
        }
       }
               
}
