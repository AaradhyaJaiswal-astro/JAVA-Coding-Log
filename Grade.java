import java.util.Scanner;
public class Grade
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("please enter your science marks:");
        int a=in.nextInt();
        System.out.println("please enter your maths marks:");
        int b=in.nextInt();
        System.out.println("please enter your english marks:");
        int c=in.nextInt();
        int total= a+b+c;
        System.out.println("Your total marks is:" +total);
        if(total>=250)
        {
            System.out.println("Your grade is: A+");
        }
        else if(total>=200 && total<=249)
        {
            System.out.println("Your grade is: B");
        }
        else if(total>=99 && total<=199)
        {
            System.out.println("Your grade is: C");
        }
        else{
            System.out.println("Your grade is: F");
        }
    }

}