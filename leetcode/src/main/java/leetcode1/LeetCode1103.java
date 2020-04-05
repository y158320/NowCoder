package leetcode1;

import org.junit.Test;

/**
 * 排排坐，分糖果。
 *
 * 我们买了一些糖果 candies，打算把它们分给排好队的 n = num_people 个小朋友。
 *
 * 给第一个小朋友 1 颗糖果，第二个小朋友 2 颗，依此类推，直到给最后一个小朋友 n 颗糖果。
 *
 * 然后，我们再回到队伍的起点，给第一个小朋友 n + 1 颗糖果，第二个小朋友 n + 2 颗，依此类推，直到给最后一个小朋友 2 * n 颗糖果。
 *
 * 重复上述过程（每次都比上一次多给出一颗糖果，当到达队伍终点后再次从队伍起点开始），直到我们分完所有的糖果。注意，就算我们手中的剩下糖果数不够（不比前一次发出的糖果多），这些糖果也会全部发给当前的小朋友。
 *
 * 返回一个长度为 num_people、元素之和为 candies 的数组，以表示糖果的最终分发情况（即 ans[i] 表示第 i 个小朋友分到的糖果数）。
 *
 */
public class LeetCode1103 {

    int[] a={};

    @Test
    public void say()
    {
        System.out.println("11217");
        int candies=7;
        int num_people=4;
        distributeCandies1(candies,num_people);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public int[] distributeCandies(int candies, int num_people) {
      int[] b=new int[num_people];
      paixu(1,num_people,b,candies);
      return null;
    }

    public void paixu(int start,int length,int[] b,int candies)
    {
        for (int i=0;i<length;i++)
        {
            b[i]=b[i]+start;
            if (candies<=start)
            { break; }
            candies=candies-start;
            start++;
            a=b;
        }
        paixu(start,length,b,candies);
    }

    public int[] distributeCandies1(int candies, int num_people) {
        int[] nums = new int[num_people];
        int start=1;
        while (candies>0) {
            for (int i = 0; i < nums.length&&candies>0; i++) {
                if (candies>start) {
                    nums[i]+=start;
                }else {
                    nums[i]+=candies;
                }
                candies = candies-start;
                start++;
            }
        }
        return nums;
    }

}
