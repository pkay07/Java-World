package Module1;
import java.util.Scanner;
public class DecimalToBinary
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int placeValue = 1;
        int binary = 0;

        for(int i = 1; n > 0; i++)
        {
            binary = placeValue*(n%2) + binary;

            placeValue = placeValue*10;

            n = n/2;

        }
        System.out.println(binary);
    }
}
