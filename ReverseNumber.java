// best code is in CN

package Module1;
import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int reverse = 0;


        for(int i = 1; n > 0; i++)
        {
            if(n%10 == 0)
            {
                n = n/10;
                continue;
            }

            int a = n%10;
            n = n/10;

            reverse = reverse*10 + a;
        }

        System.out.println(reverse);
    }

}
