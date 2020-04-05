package leetcode1;

import org.junit.Test;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 */
public class LeetCode61 {

    @Test
    public void say()
    {
        int[] digits={9};
        int[] a=plusOne(digits);
        for (int i=0;i<digits.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public int[] plusOne(int[] digits) {
          int flag=0;
          for (int i=digits.length-1;i>=0;i--)
          {
              if (flag==1 || i==(digits.length-1))
              {
                      if ((digits[i]+1)==10)
                      {
                          flag=1;
                          digits[i]=0;
                      }else
                      {
                          flag=0;
                          if (i==(digits.length-1))
                          {
                              digits[i]=digits[i]+1;
                          }else {
                              digits[i]=digits[i]+1;
                          }
                      }

              }else
              {
                  break;
              }
          }
          return digits;
    }

    public int[] plusOne1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
