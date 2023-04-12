import java.util.*;
class NoBalance extends Exception
{
    public NoBalance(String info)
    {
        super(info);
    }
}
public class YesBankUserDefinedEx {
    public static void main(String args[])
    {
        int balance=2000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdrawal amount");
        int withdrawalamount = sc.nextInt();
        try{
            if(balance<withdrawalamount)
            {
                throw new NoBalance("No Sufficent Balance");
            }
            else
            {
                balance = balance-withdrawalamount;
                System.out.println("Available Balance is"+balance);
            }
        }
        catch(NoBalance ex)
        {
            System.out.println(ex);
        }
    }
    
}
