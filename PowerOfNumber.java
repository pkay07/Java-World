package Module1;


import java.util.Scanner;

public class PowerOfNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int n = s.nextInt();

        int a = x;

        for(int i = 2; i <=n; i++)
        {
            a = a*x;

        }
        System.out.println(a);

    }
}
