public class lab04objectoriented 
{
    private String CarModel;
    public  void setcarmodel(String model)
    {
        CarModel = model;
    }
    private String CarName;
    public  void setcarname(String CName)
    {
        CarName=CName;
    }
    private int CarPrice;
    public void setcarprice(int price)
    {
        CarPrice = price;
    }
    private String CarOwner;
    public  void setcarowner(String owner)
    {
        CarOwner = owner;
    }
    public  void showdetail()
    {
        System.out.println("CAR MODEL:"+ CarModel);
        System.out.println("CAR NAME:"+ CarName);
        System.out.println("CAR PRICE IN $:"+ CarPrice);
        System.out.println("CAR OWNER:"+ CarOwner);
    }
}
