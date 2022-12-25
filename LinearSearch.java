/* this search is performed on an unsorted array where we traverse each and every element
   of the array and return the index value if found the element else return -1 */

package Module2;
import java.util.Scanner;
public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = {1,2,3,4,5,6};

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == n)
            {
                System.out.println(i);
                return;

            }
        }
        System.out.println(-1);
    }

}
