import java.util.Scanner;
public class Age
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(" please enter your birth year");
        int birthyear= in.nextInt();
        System.out.println("enter the current year");
        int currentyear= in.nextInt();
        int age= currentyear-birthyear;
        System.out.println("your curent age is: "+age);
        

    } 
}