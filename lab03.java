/*
3. Write a program for for-loop and it should add all the values one by one from 1-100 and show the 
result at the end
 */
import java.util.Scanner;
public class lab03 
{
    public static void main(String[] args)
    {
        int sum=0;
        for(int i=1; i<=100;i++)
        {
            sum= sum+i;
        }
        System.out.println("the sum of 1-100 number is:" + sum);
    }
}
