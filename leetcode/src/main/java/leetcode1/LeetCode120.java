package leetcode1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 *
 * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 *
 *  
 *
 * 例如，给定三角形：
 *
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 *
 */
public class LeetCode120 {

    @Test
    public void say()
    {
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list.add(2);
        List<Integer> list1=new ArrayList<>();
        list1.add(3);
        list1.add(4);
        List<Integer> list2=new ArrayList<>();
        list2.add(6);
        list2.add(5);
        list2.add(7);
        List<Integer> list3=new ArrayList<>();
        list3.add(4);
        list3.add(1);
        list3.add(8);
        list3.add(3);
        lists.add(list);
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        System.out.println(minimumTotal(lists));
    }

    public int minimumTotal(List<List<Integer>> triangle) {

        if (triangle == null || triangle.size() == 0){
            return 0;
        }
        // 加1可以不用初始化最后一层
        int[][] dp = new int[triangle.size()+1][triangle.size()+1];

        for (int i = triangle.size()-1; i>=0; i--){
            List<Integer> curTr = triangle.get(i);
            for(int j = 0 ; j< curTr.size(); j++){
                dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1]) + curTr.get(j);
            }
        }
        return dp[0][0];
    }

    public int dsf(List<List<Integer>> triangle,int ceng,int num)
    {
        if (triangle==null||triangle.size()==0 || triangle.size()>=ceng+1)
        {
            return 0;
        }
        int a=triangle.get(ceng).get(num);
        a=a+Math.max(dsf(triangle,ceng+1,num),dsf(triangle,ceng+1,num+1));
        return a;
    }

}
