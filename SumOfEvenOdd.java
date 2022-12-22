package Module1;
import java.io.OutputStream;
import java.util.Scanner;
public class SumOfEvenOdd
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int Even_Sum = 0;
        int Odd_Sum = 0;

        int n = s.nextInt();

        while(n > 0)
        {
            int a = n%10;
            if(a%2 == 0)
            {
                Even_Sum = Even_Sum + a;

            }
            else
            {
                Odd_Sum = Odd_Sum + a;

            }

            n = n/10;
        }

        System.out.printf(Even_Sum + " " + Odd_Sum);
    }
}
