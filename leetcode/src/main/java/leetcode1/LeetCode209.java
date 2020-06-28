package leetcode1;

import org.junit.Test;

public class LeetCode209 {

    @Test
    public void say()
    {
        int[] nums={2,3,1,2,4,3};
        minSubArrayLen(7,nums);
    }

    public int minSubArrayLen(int s, int[] nums) {
        int i = 0;
        int sum = 0;
        int len = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= s) {
                len = len == 0 ? j - i + 1 : Math.min(len, j - i + 1);
                sum -= nums[i++];
            }
        }
        return len;
    }

}
