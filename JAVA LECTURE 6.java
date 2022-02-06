public class Main
{
    public static void main(String[] args)
    {
        int num1=67;
        int num2=56;
        int num3=78;
        if((num1>num2)&&(num1>num3))
        {
            System.out.println("NUM1 is greatest then NUM2 and NUM3");
        }
        if((num2>num1)&&(num2>num3))
        {
            System.out.println("NUM2 is greatest then NUM1 and NUM3");
        }
        if((num3>num1)&&(num3>num2))
        {
            System.out.println("NUM3 is greatest then NUM1 and NUM2");
        }
    }
}