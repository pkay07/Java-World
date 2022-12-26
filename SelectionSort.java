package Module2;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr = {1,3,0,4,2,7,6,};

        for(int i = 0; i < arr.length-1; i++)
        {
            int minValue = arr[i];
            int minIndex = i;

            for(int j = i+1; j < arr.length; j++)
            {
                if(minValue > arr[j])
                {
                    minValue = arr[j];
                    minIndex = j;
                }
            }

            arr[minIndex] = arr[i];
            arr[i] = minValue;
        }

        System.out.println("here is the sorted array");


        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
