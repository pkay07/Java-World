package Module2;

public class InsertionSort
{
    public static void main(String args[])
    {
//        int arr[] = {4,3,6,8,1,5,7};
          int arr[] = {9,7,6,8,4,5,2,3};

        for(int i = 1; i < arr.length; i++)
        {
            int temp = arr[i];

            for(int j = i-1; j >= 0; j--)
            {
                if(arr[j] > temp)
                {
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
