
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        for(int i=50;i<=100;i++)
        {
          float celsius = 5.0/9.0*(i-32);
          System.out.println(i+("and")+celsius);
        }
    }
}
