// creating array using new keyword

package Module2;
import java.util.Scanner;
public class Array2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
