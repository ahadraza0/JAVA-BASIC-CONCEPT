public class lab04procedural 
{
    static String CarModel;
    public static void setcarmodel(String model)
    {
        CarModel = model;
    }
    static String CarName;
    public static void setcarname(String CName)
    {
        CarName=CName;
    }
    static int CarPrice;
    public static void setcarprice(int price)
    {
        CarPrice = price;
    }
    static String CarOwner;
    public static void setcarowner(String owner)
    {
        CarOwner = owner;
    }
    public static void showdetail()
    {
        System.out.println("CAR MODEL:"+ CarModel);
        System.out.println("CAR NAME:"+ CarName);
        System.out.println("CAR PRICE IN $"+ CarPrice);
        System.out.println("CAR OWNER:"+ CarOwner);
    }
    public static void main(String[] args)
    {
        setcarmodel("MODEL Y");
        setcarname("TESLA");
        setcarprice(45960);
        setcarowner("ABDUL AHAD RAZA");
        showdetail();
    }
}
