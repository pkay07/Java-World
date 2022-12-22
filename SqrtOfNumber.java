// in this code we are only finding the integral part of the sqrt

package Module1;
import java.util.Scanner;
public class SqrtOfNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);

        int n = s.nextInt();
        int sqrt = 0;

        for(int i = 1; i*i <= n; i++)
        {
            sqrt = i;

        }
        System.out.println(sqrt);

    }
}
