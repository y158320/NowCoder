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
       //最大的值放到最后，不再进行比较
       for (int i=arr.length-1;i>0;i--)
       {
           //第一个数据开始进行比较
           for (int j=1;j<=i;j++)
           {
               //大的元素进行下沉
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
        //从后面进行小的元素上浮
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
