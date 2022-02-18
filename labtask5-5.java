import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of computer:");
        int computer = sc.nextInt();
        System.out.println("enter the marks of mathmatics:");
        int mathmatics = sc.nextInt();
        System.out.println("enter the marks of physics:");
        int physics = sc.nextInt();
        System.out.println("enter the value of chemistry:");
        int chemistry = sc.nextInt();
        System.out.println("enter the value of biology:");
        int biology = sc.nextInt();
        int total_marks = chemistry+computer+mathmatics+physics+biology;
        int percentage = total_marks*100/500;
        if(percentage>=90)
        {
            System.out.println("your grade is A");
        }
        else if(percentage>=80)
        {
            System.out.println("your grade is B");
        }
        else if(percentage>=70)
        {
            System.out.println("your grade is C");
        }
        else if(percentage>=60)
        {
            System.out.println("your grade is D");
        }
        else if(percentage>=50)
        {
            System.out.println("your grade is E");
        }
        else
        {
            System.out.println("your grade is F");
        }
    }
}
