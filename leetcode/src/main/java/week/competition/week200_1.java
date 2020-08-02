package week.competition;

import org.junit.Test;

/**
 * 给你一个整数数组 arr ，以及 a、b 、c 三个整数。请你统计其中好三元组的数量。
 *
 * 如果三元组 (arr[i], arr[j], arr[k]) 满足下列全部条件，则认为它是一个 好三元组 。
 *
 * 0 <= i < j < k < arr.length
 * |arr[i] - arr[j]| <= a
 * |arr[j] - arr[k]| <= b
 * |arr[i] - arr[k]| <= c
 * 其中 |x| 表示 x 的绝对值。
 *
 * 返回 好三元组的数量 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
 * 输出：4
 * 解释：一共有 4 个好三元组：[(3,0,1), (3,0,1), (3,1,1), (0,1,1)] 。
 * 示例 2：
 *
 * 输入：arr = [1,1,2,2,3], a = 0, b = 0, c = 1
 * 输出：0
 * 解释：不存在满足所有条件的三元组。
 */
public class week200_1 {

    @Test
    public void say()
    {
        int[] arr={4,9,9,8,9,5,3,7};
        System.out.println(countGoodTriplets(arr,1,3,0));
    }
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
      if(arr==null || arr.length<3)
      {
          return 0;
      }
      int count=0;
      for (int i=0;i<arr.length-2;i++)
      {
          for (int j=i+1;j<arr.length-1;j++)
          {
              for (int k=j+1;k<arr.length;k++)
              {
                  if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c)
                  {
                      count=count+1;
                  }
              }
          }
      }
      return count;
    }

}
