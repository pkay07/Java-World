package Module1;
import java.util.Scanner;
public class CheckPrime
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n == 1)
        {
            System.out.println("1 is not a prime nor a composite");
        }
        if(n == 2)
        {
            System.out.println("2 is the only even prime number");
        }

        boolean isPrime = true;

        int i = 2;

        while(i <= n/2)
        {
            if(n%i == 0)
            {
                isPrime = false;
                break;

            }
            i++;

        }

        if(isPrime)
        {
            System.out.printf("prime");
        }
        else {
            System.out.printf("composite");
        }


    }
}
