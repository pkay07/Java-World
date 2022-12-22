package Module1;
import java.util.Scanner;
public class BinaryToDecimal
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int binary = s.nextInt();

        int pv = 1;

        int number = 0;

        for(int i = 1; binary > 0; i++)
        {
            number = pv*(binary%10) + number;

            pv*= 2;

            binary = binary/10;
        }

        System.out.println(number);
    }

}
