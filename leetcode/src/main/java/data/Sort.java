package data;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int index = 0;
        for(int i = 20;i > 0;i--)
            arr[index++] = i;
        System.out.println("原数组：");
        System.out.println(Arrays.toString(arr));
        System.out.println("开始排序");
        arr = QuickSort(arr);
        System.out.println("排序后为：");
        System.out.println(Arrays.toString(arr));
    }

    // 工具：交换数组中元素的位置
    public static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    // ****** 1.直接插入排序 ******
    public static int[] InsertionSort(int[] arr){
        if(arr.length == 0 || arr.length == 1)
            return arr;
        for(int i = 0;i < arr.length - 1;i++){
            // 将 i+1 位置的数插入 0 到 i 之间的数组，从后往前遍历
            // current 指 i+1 的位置元素，pre 指 0 到 i 中依次向前遍历的指针
            int current = arr[i+1];
            int pre = i;
            while(pre >= 0 && current < arr[pre]){
                arr[pre+1] = arr[pre];
                pre--;
            }
            // 最后将原来 i+1 位置的元素放入现在 0 到 i+1 之间数组中正确的位置上
            // pre+1 是因为刚才循环结束时又自减了一次
            arr[pre+1] = current;
            // 打印这一轮的排序结果
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    // ****** 2.希尔排序 ******
    // 希尔排序最重要的变量就是 gap，所有需要+1或者自加1的地方都要注意
    public static int[] ShellSort(int[] arr){
        if(arr.length == 0 || arr.length == 1)
            return arr;
        int current, gap = arr.length / 2;
        while(gap > 0){
            for(int  i = gap;i < arr.length;i++){
                // 将 pre+gap 位置的数插入 0 到 pre 之间“同组”的数组，从后往前遍历
                // current 指 pre+gap 的位置元素
                current = arr[i];
                int pre = i - gap;
                while(pre >= 0 && arr[pre] > current){
                    arr[pre+gap] = arr[pre];
                    pre -= gap;
                }
                arr[pre+gap] = current;
                // 打印这一轮的排序结果
                System.out.println(Arrays.toString(arr));
            }
            gap /= 2;
        }
        return arr;
    }

    // ****** 3.简单选择排序 ******
    public static int[] SelectionSort(int[] arr){
        if(arr.length == 0 || arr.length == 1)
            return arr;
        for(int i = 0;i < arr.length - 1;i++){
            // 每一轮挑出一个最小的元素，依次与不断增长的 i 位置的元素交换
            int MinIndex = i;
            for(int j = i;j < arr.length;j++){
                if(arr[j] < arr[MinIndex])
                    MinIndex = j;
            }
            arr = swap(arr,MinIndex,i);
            // 打印这一轮的排序结果
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    // ****** 4.堆排序 ******
    // 主函数
    public static int[] HeapSort(int[] arr){
        if(arr.length == 0 || arr.length == 1)
            return arr;
        int len = arr.length;
        // 堆排序第一步是先把当前数组变成一个最大堆
        arr = AdjustMaxHeap(arr, len-1);
        while(len > 0){
            // 取出堆顶的元素（最大元素）与末尾还没有确定位置的元素交换
            arr = swap(arr,0,len - 1);
            // 打印这一轮的排序结果
            System.out.println(Arrays.toString(arr));
            len--;
            arr = AdjustMaxHeap(arr,len - 1);
        }
        return arr;
    }
    // 调整为最大堆
    public static int[] AdjustMaxHeap(int[] arr, int lastIndex){
        for(int i = (lastIndex - 1) / 2;i>=0;i--){
            arr = AdjustLocalHeap(arr,lastIndex,i);
        }
        return arr;
    }
    //调整局部堆使其成为局部最大堆
    /*
     注意事项：堆中结点是从 1 开始的，但把数组看作堆的话，数组的下标是从 0 开始的
     那么父结点与子结点的关系就会发生变化：
        父结点 = （子结点-1）/2
        左子结点 = 父结点*2+1
        右子结点 = 父结点*2+2
     */
    public static int[] AdjustLocalHeap(int[] arr,int lastIndex,int i){
        // 找出当前结点和左右子结点（如果有左右子结点的话）中最大的元素，让这个最大的元素成为父结点
        int maxIndex = i;
        if(i*2+1 <= lastIndex && arr[i] < arr[i*2+1])
            maxIndex = i*2+1;
        // 这里要多一个右子结点是否大于左子结点的判定
        if(i*2+2 <= lastIndex && arr[i] < arr[i*2+2] && arr[i*2+1] < arr[i*2+2])
            maxIndex = i*2+2;
        // 如果父结点不是三个结点中的最大结点，那么将最大结点变成父结点
        // 再通过递归看看这个比较小的父结点能不能再“往下沉”
        if(maxIndex != i){
            arr = swap(arr,maxIndex,i);
            arr = AdjustLocalHeap(arr,lastIndex,maxIndex);
        }
        return arr;
    }

    // ****** 5.冒泡排序 ******
    public static int[] BubbleSort(int[] arr){
        if(arr.length == 0 || arr.length ==1)
            return arr;
        for(int i = arr.length-1;i > 0;i--){
            for(int j = 1;j <= i;j++){
                if(arr[j] < arr[j-1])
                    arr = swap(arr,j,j-1);
            }
            // 打印这一轮的排序结果
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    // ****** 6.快速排序 ******
    //主函数
    public static int[] QuickSort(int[] arr){
        if(arr.length == 0 || arr.length ==1)
            return arr;
        arr = LocalQuickSort(arr,0,arr.length -1 );
        return arr;
    }
    // 快速排序
    public static int[] LocalQuickSort(int[] arr, int start, int last){
        if(start >= last)
            return arr;
        // benchmark 指基准数，也就是这一轮将要确定位置的数
        int benchmark = arr[start];
        int left = start;
        int right = last;
        while(left < right){
            // 必须右指针先走
            while(arr[right] > benchmark && left < right) right--;
            if(arr[right] <= benchmark && left < right) arr[left++] = arr[right];
            while(arr[left] < benchmark && left < right) left++;
            if(arr[right] >= benchmark && left < right) arr[right--] = arr[left];
        }
        arr[left] = benchmark;
        // 通过递归，分别对已确定位置的数的两边区域进行快速排序
        arr = LocalQuickSort(arr,start,left-1);
        arr = LocalQuickSort(arr,left+1,last);
        return arr;
    }

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
                tempArr[p++] = arr[p1++];
            else
                tempArr[p++] = arr[p2++];
        }
        while(p1 <= mid) tempArr[p++] = arr[p1++];
        while(p2 <= last) tempArr[p++] = arr[p2++];
        // 将额外数组中的数据覆盖到原 arr 数组中
        for(int i = start;i <= last;i++)
            arr[i] = tempArr[i];
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    // ****** 8.基数排序 ******
    public static int[] RadixSort(int[] arr){
        if(arr.length == 0 || arr.length ==1)
            return arr;
        // max 指数组中最大的数，maxDigit 指这个最大的数是几位数
        int max = arr[0];
        for(int x:arr)
            max = Math.max(x,max);
        int maxDigit = 0;
        while(max != 0){
            max /= 10;
            maxDigit++;
        }
        // mod 用于为数组中的数取余数，div 用于把通过 mod 取的余数变成个位数
        int mod = 10;
        int div = 1;
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>();
        for(int j = 0;j < 10;j++){
            bucket.add(new ArrayList<Integer>());
        }
        for(int i = 0;i<maxDigit;i++,mod *= 10,div *= 10){
            // 打印这一轮的排序结果
            System.out.println(Arrays.toString(arr));
            for(int j = 0;j < arr.length;j++){
                // num 指当前元素 arr[j] 的个/十/百/千位是几
                int num = (arr[j] % mod) / div;
                bucket.get(num).add(arr[j]);
            }
            int index = 0;
            for(int j = 0;j < 10;j++){
                if(bucket.get(j).size() != 0){
                    for(int x:bucket.get(j))
                        arr[index++] = x;
                    // 将桶中所有的动态数组清空，否则第二次循环开始再用到这些动态数组时里面还会有数据
                    bucket.get(j).clear();
                }
            }
        }
        return arr;
    }

    // ****** 9.计数排序 ******
    public static int[] CountingSort(int[] arr){
        if(arr.length ==0 || arr.length == 1)
            return arr;
        int min, max;
        min = max = arr[0];
        for(int x: arr){
            if(x > max)
                max = x;
            if(x < min)
                min = x;
        }
        // bucket 指用来存储每个元素出现次数的桶，长度为元素的范围
        int[] bucket = new int[max - min +1];
        // 把 bucket 用 0 填满，因为之后要累加
        Arrays.fill(bucket,0);
        // 在 bucket 中相应的位置记录每个元素出现的次数
        for(int x:arr){
            bucket[x - min]++;
        }
        int index = 0;
        // 依次从 bucket 中提取元素覆盖到原来的 arr 上
        for(int i =0;i<bucket.length;i++){
            while(bucket[i] != 0){
                arr[index++] = i + min;
                bucket[i]--;
            }
        }
        return arr;
    }

    // ****** 10.桶排序 ******
    // 主函数
    public static int[] BucketSort(int[] arr){
        if(arr.length == 0 || arr.length == 1)
            return arr;
        arr = Bucket(arr,5);
        return  arr;
    }
    // 桶排序
    // bucketSize 指每个桶的容量，bucketCount 指桶的个数
    public static int[] Bucket(int[] arr,int bucketSize){
        int min,max;
        min = max = arr[0];
        for(int x:arr){
            if(x > max)
                max = x;
            if(x > min)
                min = x;
        }
        int bucketCount = (max - min) / bucketSize +1;
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>();
        for(int i = 0;i < bucketCount;i++)
            bucket.add(new ArrayList<Integer>());
        for(int x: arr){
            // 遍历每个桶
            for(int bucketIndex = 0;bucketIndex < bucketCount;bucketIndex++){
                // 如果 arr 当前元素在该桶的范围内，则将该元素放入该桶内，并结束遍历每个桶的循环
                if(x >= min + bucketIndex*bucketSize && x < min + (bucketIndex+1)*bucketSize){
                    bucket.get(bucketIndex).add(x);
                    break;
                }
            }
        }
        int index = 0;
        for(int i = 0;i < bucketCount;i++){
            // 对每个桶使用直接插入排序，调整桶内元素的顺序
            bucket.set(i,InsertionSortOfArrayList(bucket.get(i)));
            for(int x:bucket.get(i))
                arr[index++] = x;
        }
        return arr;
    }
    // 针对动态数组的直接插入排序
    public static ArrayList<Integer> InsertionSortOfArrayList(ArrayList<Integer> arr){
        if(arr.size() == 0 || arr.size() ==1)
            return arr;
        int current;
        int pre;
        for(int i = 0;i < arr.size() - 1;i++){
            pre = i;
            current = arr.get(i+1);
            while(arr.get(pre) > current && pre >= 0){
                arr.set(pre+1,arr.get(pre));
                pre--;
            }
            arr.set(pre+1,current);
        }
        return arr;
    }
}
