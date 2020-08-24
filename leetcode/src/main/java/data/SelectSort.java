package data;

import org.junit.Test;

import java.util.Arrays;

public class SelectSort {

    @Test
    public void say()
    {
        int[] arr=new int[20];
        int index = 0;
        for(int i = 20;i > 0;i--)
            arr[index++] = i;
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public int[] selectSort(int[] arr) {
        //直接循环遍历最小的
       for (int i=0;i<arr.length-1;i++)
       {
           int min=i;
           for (int j=i+1;j<arr.length;j++)
           {
               if (arr[j]<arr[i])
               {
                   min=j;
               }
           }
           if (min!=i)
           {
               int temp=arr[i];
               arr[i]=arr[min];
               arr[min]=temp;
           }
       }
       return arr;
    }
}
