package leetcode1;

import org.junit.Test;

public class LeetCode343 {

    @Test
    public void say()
    {
        System.out.println(integerBreak(3));
    }

    public int integerBreak(int n) {
        int ans = 1;
        if(n<4) return n-1; // n <  4时, 两数之和大于两数之积
        while(n>4){  // n=4时,3*1<3+1,但当n=5时,3*2>3+2
            n -= 3;
            ans *= 3;
        }
        return ans * n;  //最后返回的时候记得乘上最后剩下的n
    }

}
