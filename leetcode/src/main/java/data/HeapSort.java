package data;

import org.junit.Test;

import java.util.Arrays;

public class HeapSort {

    @Test
    public void say()
    {
        int[] arr={2,1,4,5,3};
        arr=headSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 堆排序
    public int[] headSort(int[] arr) {
        int n = arr.length;
        //构建大顶堆
        for (int i = (n - 2) / 2; i >= 0; i--) {
            downAdjust(arr, i, n - 1);
        }
        //进行堆排序
        for (int i = n - 1; i >= 1; i--) {
            // 把堆顶元素与最后一个元素交换
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            // 把打乱的堆进行调整，恢复堆的特性
            downAdjust(arr, 0, i - 1);
        }
        return arr;
    }

    //下沉操作
    public void downAdjust(int[] arr, int parent, int n) {
        //临时保存要下沉的元素
        int temp = arr[parent];
        //定位左孩子节点的位置
        int child = 2 * parent + 1;
        //开始下沉
        while (child <= n) {
            // 如果右孩子节点比左孩子大，则定位到右孩子
            if(child + 1 <= n && arr[child] < arr[child + 1])
                child++;
            // 如果孩子节点小于或等于父节点，则下沉结束
            if (arr[child] <= temp ) break;
            // 父节点进行下沉
            arr[parent] = arr[child];
            parent = child;
            child = 2 * parent + 1;
        }
        arr[parent] = temp;
    }
}
