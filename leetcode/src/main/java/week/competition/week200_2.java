package week.competition;

import org.junit.Test;

import java.util.Arrays;

/**
 * 给你一个由 不同 整数组成的整数数组 arr 和一个整数 k 。
 *
 * 每回合游戏都在数组的前两个元素（即 arr[0] 和 arr[1] ）之间进行。比较 arr[0] 与 arr[1] 的大小，较大的整数将会取得这一回合的胜利并保留在位置 0 ，较小的整数移至数组的末尾。当一个整数赢得 k 个连续回合时，游戏结束，该整数就是比赛的 赢家 。
 *
 * 返回赢得比赛的整数。
 *
 * 题目数据 保证 游戏存在赢家。
 *
 *
 *
 * 示例 1：
 *
 * 输入：arr = [2,1,3,5,4,6,7], k = 2
 * 输出：5
 * 解释：一起看一下本场游戏每回合的情况：
 *
 * 因此将进行 4 回合比赛，其中 5 是赢家，因为它连胜 2 回合。
 * 示例 2：
 *
 * 输入：arr = [3,2,1], k = 10
 * 输出：3
 * 解释：3 将会在前 10 个回合中连续获胜。
 * 示例 3：
 *
 * 输入：arr = [1,9,8,2,3,7,6,4,5], k = 7
 * 输出：9
 * 示例 4：
 *
 * 输入：arr = [1,11,22,33,44,55,66,77,88,99], k = 1000000000
 * 输出：99
 */
public class week200_2 {

    @Test
    public void say()
    {
        int[] arr={2,1,3,5,4,6,7};
        System.out.println(getWinner(arr,2));
    }

    public int getWinner(int[] arr, int k) {
      if (arr==null)
      {
          return 0;
      }
      if (k==0)
      {
          return arr[0];
      }
      if (arr.length==1)
      {
          return arr[0];
      }
      if (arr.length==2)
      {
          return Math.max(arr[0],arr[1]);
      }
      int count=0;
      int num=0;
      int max=0;
      for (int i=0;i<arr.length;i++)
      {
          max=Math.max(max,arr[i]);
      }
      while (count!=k)
      {
         if (arr[0]==max || arr[1]==max)
         {
             return max;
         }
         if (arr[0]<arr[1])
         {
            if (num!=arr[1])
            {
                num=arr[1];
                count=1;
            }else
            {
                count=count+1;
            }
            if (count==k)
            {
                 return num;
            }
            arr=dfs(arr,0);
         }else
         {

             if (num!=arr[0])
             {
                 num=arr[0];
                 count=1;
             }else
             {
                 count=count+1;
             }
             if (count==k)
             {
                 return num;
             }
             arr=dfs(arr,1);
         }
      }
      return num;
    }

    public int[] dfs(int[] arr,int num)
    {
        for (int i=num;i<arr.length-1;i++)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }

    public int getWinner1(int[] arr, int k) {
        int win=arr[0],count=0;/*win:胜利者,count:获胜场次*/
        for(int i=1;i<arr.length&&count<k;i++){/*到达获胜场次跳出循环*/
            if(arr[i]<win){/*arr[i]比win小*的情况*/
                count++;
            }else{/*如果win输掉了产生新的胜利者，count置为1*/
                win=arr[i];
                count=1;
            }
        }
        return win;/*遍历一遍都没到达k,直接返回最大值*/
    }

}
