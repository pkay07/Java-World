package Module2;

public class MergeTwoSortedArray
{
    public static int[] mergedArray(int[] arr1, int[] arr2)
    {
        int[] arr4 = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] <= arr2[j])
            {
                arr4[k] = arr1[i];
                i++;
                k++;
            }
            else
            {
                arr4[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length)
        {
            arr4[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length)
        {
            arr4[k] = arr2[j];
            j++;
            k++;
        }

        return arr4;
    }

    public static void print(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


   public static void main(String[] args)
   {
       int[] arr1 = {1,3,5,7,9};

       int[] arr2 = {2,4,6,8,10};

       int[] arr3 = mergedArray(arr1, arr2);

       print(arr3);
   }
}
