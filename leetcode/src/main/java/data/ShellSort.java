package data;

import org.junit.Test;

import java.util.Arrays;

public class ShellSort {

    @Test
    public void say()
    {
        int[] arr=new int[20];
        int index = 0;
        for(int i = 20;i > 0;i--)
            arr[index++] = i;
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public int[] shellSort(int arr[]) {
        //希尔排序
        int gap = arr.length;
        while (true) {
            //增量每次减半
            gap /= 2;
            //里面就是直接插入排序
            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < arr.length; j += gap) {
                    int temp = arr[j];
                    int k = j - gap;
                    while (k >= 0 && arr[k] > temp) {
                        arr[k + gap] = arr[k];
                        k -= gap;
                    }
                    arr[k + gap] = temp;
                }
            }
            if (gap == 1)
                break;
        }
        return arr;
    }
}
