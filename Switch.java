import java.util.Scanner;
public class Switch
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner in= new Scanner(System.in);
        System.out.println("1.Sum\n 2.Substract\n");
        c=in.nextInt();
        
        switch (c)
        {
        case 1: System.out.println("Please enter 2 numbers for addition");
            a=in.nextInt();
            b=in.nextInt();
            System.out.println("the addition is: "+(a+b));
            break;
        case 2:System.out.println("Please enter 2 numbers for substraction");
            a=in.nextInt();
            b=in.nextInt();
            System.out.println("the substraction is: "+(a-b));
            break;
        default : System.out.println("Please choose one from the amongst given options");
        }
    }   
}