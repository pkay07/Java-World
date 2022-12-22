// in this tutorial we will print the n factorial numbers

package Module1;
import java.util.Scanner;
public class Fibonnaci2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int zeroth = 0;
        int first = 1;
        int temp = 0;

        System.out.println("please enter the number till you want to print he numbers");

        int n = s.nextInt();

        System.out.print(zeroth+ " " + first+ " ");
        for(int i = 1; i < n; i++)
        {
            temp = zeroth + first;

            System.out.print(temp+ " ");

            zeroth = first;
            first = temp;

        }



    }


}
