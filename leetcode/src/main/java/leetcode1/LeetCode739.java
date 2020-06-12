package leetcode1;

import org.junit.Test;

import java.util.Stack;

/**
 * 请根据每日 气温 列表，重新生成一个列表。对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 *
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 *
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
 *
 */
public class LeetCode739 {

    @Test
    public void say()
    {
        int[] T={73, 74, 75, 71, 69, 72, 76, 73};
        dailyTemperatures(T);
    }

    public int[] dailyTemperatures(int[] T) {
       int[] a=new int[T.length];
       for (int i=0;i<T.length;i++)
       {
           for (int j=i+1;j<T.length;j++)
           {
               if (T[i]<T[j])
               {
                   a[i]=j-i;
                   break;
               }
           }
       }
        return a;
    }

    public int[] dailyTemperatures1(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[T.length];
        for(int i = 0 ; i < T.length ; i++){
            while (!stack.isEmpty() && T[stack.peek()] < T[i]){
                int index = stack.pop();
                res[index] = i - index;
            }
            stack.push(i);
        }
        return res;
    }

}
