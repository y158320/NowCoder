package leetcode1;

import java.util.Arrays;

public class LeetCode153 {

    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

}
