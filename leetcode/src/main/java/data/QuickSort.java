package data;

import java.util.Arrays;

public class QuickSort {

    public static void ysort(int arr[]) {
       for (int i=0;i<arr.length-1;i++)
       {
           //代表位置
           int count=i;
           for (int j=i+1;j<arr.length;j++)
           {
               if (arr[i]>arr[j])
               {
                   count=count+1;
                   int temp=arr[count];
                   arr[count]=arr[j];
                   arr[j]=temp;
               }
           }
           int temp=arr[count];
           arr[count]=arr[i];
           arr[i]=temp;
       }
    }

    public static int[] qsort(int arr[],int start,int end) {
        //start是开始，end是结尾  pivot是标记元素
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            //i处的元素小于标记元素不进行交换，向前移动一位
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            //j处的元素大于标记元素不进行交换，向前移动一位
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            }//交换元素，
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start)
        {
            arr=qsort(arr,start,i-1);
        }
        if (j+1<end)
        {
            arr=qsort(arr,j+1,end);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{20,19,18,9,13,17,16,15};
        int len = arr.length-1;
//        arr=qsort(arr,0,len);
        ysort(arr);
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
