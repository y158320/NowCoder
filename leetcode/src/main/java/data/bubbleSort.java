package data;

import org.junit.Test;

import java.util.Arrays;

public class bubbleSort {

    @Test
    public void say()
    {
        int[] arr=new int[20];
        int index = 0;
        for(int i = 20;i > 0;i--)
            arr[index++] = i;
        bubbleSortUp(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void bubbleSortDown(int arr[]){
       for (int i=arr.length-1;i>0;i--)
       {
           for (int j=1;j<=i;j++)
           {
               if (arr[j-1]>arr[j])
               {
                   int temp=arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=temp;
               }
           }
       }
    }

    public void bubbleSortUp(int arr[]){
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=arr.length-1;j>i;j--)
            {
                if (arr[j]<arr[j-1])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

}
