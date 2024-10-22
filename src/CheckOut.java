import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double price = 0;
        double totalCost = 0;
        boolean nextItem = false;
        boolean buyingDone = false;
        do
        {
            price = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            price += price;
            nextItem = SafeInput.getYNConfirm(in, "Do you have another item?");
            if (nextItem == true)
            {
                buyingDone = false;
            }
            else
            {
                buyingDone = true;
            }
        }while(!buyingDone);
        System.out.printf("Your total is " + price + ".");
    }
}
