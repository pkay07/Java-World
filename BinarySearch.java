package Module2;
import java.util.Scanner;
public class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();

        int[] arr = {3,5,7,11,15,18};

        int s = 0;
        int e = arr.length;

        for(int i = 0; s <= e; i++)
        {
            int m = (s+e)/2;

            if(arr[m] > n)
            {
                e = m-1;
            }
            else if(arr[m] < n)
            {
                s = s+1;
            }
            else
            {
                System.out.println(m);
                return;
            }
        }

        System.out.println(-1);
        return;


    }

}
