package data;

import java.util.Arrays;

public class QuickSort {

    public static int[] qsort(int arr[],int start,int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start) arr=qsort(arr,start,i-1);
        if (j+1<end) arr=qsort(arr,j+1,end);
        return (arr);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3,3,3,7,9,122344,4656,34,34,4656,5,6,7,8,9,343,57765,23,12321};
        int len = arr.length-1;
        arr=qsort(arr,0,len);
        for (int i:arr) {
            System.out.print(i+"\t");
        }
    }

    public int[] QuickSort(int[] arr){
        if(arr.length == 0 || arr.length ==1)
            return arr;
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {

            }
        }
        return arr;
    }
//
//    public int[] LocalQuickSort(int[] arr, int start, int last){
//        if(start >= last)
//            return arr;
//        // benchmark 指基准数，也就是这一轮将要确定位置的数
//        int benchmark = arr[start];
//        int left = start;
//        int right = last;
//        while(left < right){
//            // 必须右指针先走
//            while(arr[right] > benchmark && left < right) right--;
//            if(arr[right] <= benchmark && left < right) arr[left++] = arr[right];
//            while(arr[left] < benchmark && left < right) left++;
//            if(arr[right] >= benchmark && left < right) arr[right--] = arr[left];
//        }
//        arr[left] = benchmark;
//        // 打印这一轮的排序结果
//        System.out.println(Arrays.toString(arr));
//        // 通过递归，分别对已确定位置的数的两边区域进行快速排序
//        arr = LocalQuickSort(arr,start,left-1);
//        arr = LocalQuickSort(arr,left+1,last);
//        return arr;
//    }

}
