

package Module1;
import java.util.Scanner;
public class SumOrProduct
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int c = s.nextInt();
        int temp = 1;    // this condition is according to the question

        if(c == 1)
        {
            for(int i = 2; i <= n; i++)
            {
                temp = temp+i;
            }
            System.out.print(temp);
        }

        else if(c == 2)
        {
            for(int i = 2; i <= n; i++)
            {
                temp = temp*i;
            }
            System.out.println(temp);
        }

        else
        {
            System.out.println(-1);
        }
    }

}
