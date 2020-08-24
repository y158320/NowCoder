package data;

import java.util.Arrays;

public class MergeSort {

    // ****** 7.归并排序 ******
    // 主函数
    public int[] MergeSort(int[] arr){
        if(arr.length == 0 || arr.length ==1)
            return arr;
        arr = Merge(arr,0,arr.length-1);
        return arr;
    }
    // 归并排序
    public int[] Merge(int[] arr,int start,int last){
        // start < last 的判断意味着 arr 指定的范围内必须至少有两个元素
        if(start < last){
            int mid = (start + last) / 2;
            // 左右部分分别递归
            arr = Merge(arr,start,mid);
            arr = Merge(arr,mid+1,last);
            // 递归层面：从里往外依次将左半部分和右半部分整合成一个部分
            arr = merge(arr,start,mid,last);
        }
        return arr;
    }
    public static int[] merge(int[] arr,int start,int mid,int last){
        // tempArr 指一个额外数组，用来临时给 arr 中同一区域的元素排序
        int[] tempArr = new int[arr.length];
        // p1 指 arr 指定区域的左半部分的指针，p2 指 arr 指定区域的右半部分的指针，p 指额外数组 tempArr 的指针
        int p1 = start, p2 = mid+1, p = start;
        // 从指定区域的左右半部分中取出最小元素放入额外数组，完成指定区域内的排序
        while(p1 <= mid && p2 <= last){
            if(arr[p1] <= arr[p2])
            {
                tempArr[p++] = arr[p1++];
            }
            else
            {
                tempArr[p++] = arr[p2++];
            }
        }
        while(p1 <= mid)
        {
            tempArr[p++] = arr[p1++];
        }
        while(p2 <= last)
        {
            tempArr[p++] = arr[p2++];
        }
        // 将额外数组中的数据覆盖到原 arr 数组中
        for(int i = start;i <= last;i++)
            arr[i] = tempArr[i];
        return arr;
    }

}
