import java.util.Scanner;
public class Multiplication
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter a number to make it`s multiplication table");
        int a=in.nextInt();
        System.out.println("the table is: ");
        for(int i=0;i<=20;i++)
        {
            
            System.out.println(i*a);
        }
    }
}