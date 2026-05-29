import java.util.Scanner;
public class Notebooks
{
    //Method without return without parameter
    static double CalculateTotal(double quantity,double price)
    {
        return quantity*price;
   
    }
    static double CalculateDiscount(double total)
    {
        if(total>=1000)
        {
            return total*0.10;
        }
        else
        {
            return 0;
        }
    }
    static void displaybill(double qty,double price)
    {
        double discount= CalculateDiscount(CalculateTotal(qty,price));
        double total = CalculateTotal(qty,price);
        double finalamt = total - discount;
        System.out.println("Final Amount: "+finalamt);
       
    }
    public static void main(String [] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the quantity of notebooks");
        double quantity= in.nextDouble();
        System.out.println("Enter the price of per notebook");
        double price= in.nextDouble();
        displaybill(quantity,price);
       
       
    }
   
}

