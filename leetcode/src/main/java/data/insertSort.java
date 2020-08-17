package data;

import org.junit.Test;

import java.util.Arrays;

public class insertSort {

    @Test
    public void say()
    {
        int[] arr=new int[20];
        int index = 0;
        for(int i = 20;i > 0;i--)
            arr[index++] = i;
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public int[] insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        for (int i=1;i<arr.length;i++)
        {
            for (int j=i;j>0;j--)
            {
                if (arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }else
                {
                    break;
                }
            }
        }
        return arr;
    }

    public int[] insertSort1(int[] arr) {
        if(arr == null || arr.length < 2)
            return arr;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int k = i - 1;
            while(k >= 0 && arr[k] > temp)
                k--;
            //腾出位置插进去,要插的位置是 k + 1;
            for(int j = i ; j > k + 1; j--)
                arr[j] = arr[j-1];
            //插进去
            arr[k+1] = temp;
        }
        return arr;
    }

}
