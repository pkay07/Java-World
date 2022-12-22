// in this code we are printing the nth fibonacci number;



package Module1;
import java.util.Scanner;
public class Fibonacci
{
    public static int fibo(int a)
    {
        if(a == 0 || a == 1)
        {
            return a;
        }
        else
        {
            return fibo(a-1) + fibo(a-2);
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(fibo(n));

    }
}
