import java.util.Scanner;
public class lab03procedural 
{
    public static void CarModel()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the model of your car:");
        String model = sc.next();
        System.out.println("your car model is:"+ model);
    }
    public static void CarName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("what id your car name is:");
        String car = sc.next();
        System.out.println("your car name is:"+ car);
    }
    public static void CarPrice()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the price of your car is:");
        int price = sc.nextInt();
        System.out.println("your car price is:" + price);         
    }
    public static void CarOwner()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("who is the onwer of this car:");
        String owner = sc.next();
        System.out.println("the owner of this car is:"+ owner);
    }
    public static void main(String[] args)
    {
        CarModel();
        CarName();
        CarPrice();
        CarOwner();
    }
        
}
