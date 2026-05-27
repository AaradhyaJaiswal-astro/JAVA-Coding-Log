import java.util.Scanner;
public class Waterlevel
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the water level of the tank:");
        int level= in.nextInt();
        if(level>50)
        {
            System.out.println("high water level");
            if(level>70)
            {
                System.out.println("Overflow");
            }
        }if(level<30)
        {
            System.out.println("low water level");
        }else{
            System.out.println("Normal");
        }
    }
}