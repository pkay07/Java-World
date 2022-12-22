// in this code we will print the prime numbers that lies between 2 to n and both inclusive


package Module1;
import java.util.Scanner;
public class PrimeNumbers
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 2; i <= n; i++)
        {
            boolean isPrime = true;

            for(int j = 2; j <= i/2; j++)
            {
                if(i%j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(i);
            }
        }

    }

}
