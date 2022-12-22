// best code is given in CN in lecture 7
package Module1;

import java.util.Scanner;
public class APOfSeries
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);


        int x = s.nextInt();
        int N = 1;
        int count = 1;
        while(count <= x)
        {
            if((3*N+2)%4 == 0)
            {
                N++;
                continue;
            }
            System.out.print(3*N+2 + " ");
            N++;
            count++;

        }



    }

}
