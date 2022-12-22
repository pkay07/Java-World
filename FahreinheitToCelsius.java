package Module1;
import java.util.Scanner;
public class FahreinheitToCelsius
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();

        while(S <= E)
        {
            System.out.println(S + " " + (S-32)*5/9);
            S = S + W;
        }

    }

}
