package leetcode1;

import org.junit.Test;

import java.util.*;

/**
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的数字可以无限制重复被选取。
 *
 * 说明：
 *
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 *
 * 输入: candidates = [2,3,6,7], target = 7,
 * 所求解集为:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * 示例 2:
 *
 * 输入: candidates = [2,3,5], target = 8,
 * 所求解集为:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 *
 * result = []
 * def backtrack(路径, 选择列表):
 *     if 满足结束条件:
 *         result.add(路径)
 *         return
 *
 * for 选择 in 选择列表:
 *     做选择
 *     backtrack(路径, 选择列表)
 *     撤销选择
 *
 * 作者：jeromememory
 * 链接：https://leetcode-cn.com/problems/combination-sum/solution/hui-su-suan-fa-tao-mo-ban-ji-ke-by-jeromememory/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 */
public class LeetCode39 {

    private List<List<Integer>> res = new ArrayList<>();
    private int[] candidates;
    private int len;
    private List<Integer> list11217=new ArrayList<>();

    @Test
    public void say()
    {
        int[] candidates={2,3,6,7};
        System.out.println(combinationSum2(candidates,7));
    }

    /**
     * @param candidates
     * @param target
     * @return
     * 伪代码：
     *
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists=new ArrayList<>();
        int sum=0;
        if (0==candidates.length)
        {
            return lists;
        }
//        findCombinationSum(candidates, 0, target, track);
        return lists;
     }

     public Integer findCombinationSum(int[] candidates, int start, int target, LinkedList<Integer> track)
     {
        for (int i=start;i<candidates.length;i++)
        {
            //进行判断
            if (candidates[i]>target)
            {
                break;
            }else {
                track.add(candidates[i]);
                findCombinationSum(candidates,i,target-candidates[i],track);
                track.removeLast();
            }
        }
        return null;
     }

    public List<List<Integer>> combinationSum1(int[] candidates, int target) {
        int len = candidates.length;
        if (len == 0) {
            return res;
        }
        // 优化添加的代码1：先对数组排序，可以提前终止判断
        Arrays.sort(candidates);
        this.len = len;
        this.candidates = candidates;
        findCombinationSum(target, 0, new Stack<>());
        return res;
    }

    private void findCombinationSum(int residue, int start, Stack<Integer> pre) {
        if (residue == 0) {
            // Java 中可变对象是引用传递，因此需要将当前 path 里的值拷贝出来
            res.add(new ArrayList<>(pre));
            return;
        }
        // 优化添加的代码2：在循环的时候做判断，尽量避免系统栈的深度
        // residue - candidates[i] 表示下一轮的剩余，如果下一轮的剩余都小于 0 ，就没有必要进行后面的循环了
        // 这一点基于原始数组是排序数组的前提，因为如果计算后面的剩余，只会越来越小
        for (int i = start; i < len && residue - candidates[i] >= 0; i++) {
            pre.add(candidates[i]);
            // 【关键】因为元素可以重复使用，这里递归传递下去的是 i 而不是 i + 1
            findCombinationSum(residue - candidates[i], i, pre);
            pre.pop();
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        LinkedList<Integer> track = new LinkedList<>();
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, track);
        return res;
    }

    private void backtrack(int[] candidates, int start, int target, LinkedList<Integer> track) {
        if (target < 0) return;
        if (target == 0){
            res.add(new LinkedList<>(track));
            return;
        }
        for(int i = start;i < candidates.length;i++){
            if(target < candidates[i]) break;
            track.add(candidates[i]);
            backtrack(candidates,i,target-candidates[i],track);
            track.removeLast();
        }
    }


}
