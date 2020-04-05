package leetcode1;

import org.junit.Test;

import java.math.BigInteger;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 */
public class LeetCode67 {

    @Test
    public void say()
    {
        String a="11";
        String b="1";
        System.out.println(addBinary(a,b));
    }

    public String addBinary(String a, String b) {
           int flag=0;
           if (a.length()>=b.length())
           {
           }
           return "";
    }

    public String addBinary1(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger carry, answer;
        while (y.compareTo(zero) != 0) {
            answer = x.xor(y);
            carry = x.and(y).shiftLeft(1);
            x = answer;
            y = carry;
        }
        return x.toString(2);
    }

}
