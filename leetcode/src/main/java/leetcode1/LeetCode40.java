package leetcode1;

import org.junit.Test;

import java.util.*;

/**
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的每个数字在每个组合中只能使用一次。
 *
 * 说明：
 *
 * 所有数字（包括目标数）都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 *
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 所求解集为:
 * [
 *   [1, 7],
 *   [1, 2, 5],
 *   [2, 6],
 *   [1, 1, 6]
 * ]
 * 示例 2:
 *
 * 输入: candidates = [2,5,2,1,2], target = 5,
 * 所求解集为:
 * [
 *   [1,2,2],
 *   [5]
 * ]
 *
 */
public class LeetCode40 {

    private List<List<Integer>> res = new ArrayList<>();

    @Test
    public void say()
    {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        combinationSum1(candidates,target);
        System.out.println(res);
    }

    public List<List<Integer>> combinationSum1(int[] candidates, int target)
    {
        Arrays.sort(candidates);
        LinkedList<Integer> track = new LinkedList<>();
        backTarck(candidates,target,0,track);
        return null;
    }

    public void backTarck(int[] candidates,int target,int start,LinkedList<Integer> track)
    {
        if (target < 0) return;
        if (target == 0){
            res.add(new LinkedList<>(track));
            return;
        }
        for(int i = start;i < candidates.length;i++){
            if(target < candidates[i]) break;
            track.add(candidates[i]);
            backTarck(candidates,target-candidates[i],i+1,track);
            track.removeLast();
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int sum=0;
        for (int i=0;i<candidates.length;i++)
        {
             sum=candidates[i];
             if (sum>target)
             {
                 System.out.println("不符合小老弟!");
             }else if (sum==target)
             {
                 list.add(sum);
             }
             else {
                 combinationSum(candidates,i);
             }
        }
        return lists;
    }

    public List<Integer> combinationSum(int[] candidates,int i)
    {
        List<Integer> list=new ArrayList<>();
        return list;
    }

    public void backtrack(int[] nums , int start , int target , Stack<Integer> temp, int sum){

        HashSet hashSet = new HashSet();
        for(int i = start ; i < nums.length ; i ++){
            //剪枝1 同一个父节点的子节点必须是不同的值
            if(hashSet.contains(nums[i])){
                continue;
            }else{
                hashSet.add(nums[i]);
            }

            temp.push(nums[i]);
            sum += nums[i];

            //剪枝2 获取到目标,回溯
            if(sum == target){
                res.add(new ArrayList<>(temp));
//                这里可以再次剪枝 直接终止
//                temp.pop();
//                sum -= nums[i];
//                return;
            }else if(sum < target){
                backtrack(nums,i + 1 , target , temp , sum);
            }

            temp.pop();
            sum -= nums[i];
        }
    }

    public List<List<Integer>> combinationSum3(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates , 0 , target , new Stack<Integer>() , 0);
        return res;
    }

}
