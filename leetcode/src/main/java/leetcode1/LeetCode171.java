package leetcode1;

import org.junit.Test;

/**
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 例如，
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * 示例 1:
 *
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 *
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 *
 * 输入: "ZY"
 * 输出: 701
 *
 */
public class LeetCode171 {

    @Test
    public void say()
    {
        System.out.println(titleToNumber("AB"));
    }

    public int titleToNumber(String s) {
        int i=0;
        int num=0;
        while (i<s.length())
        {
            String a=s.substring(s.length()-i-1,s.length()-i);
            switch (a)
            {
                case"A": num=num+1+(26*i);break;
                case"B": num=num+2+(26*i);break;
                case"C": num=num+3+(26*i);break;
                case"D": num=num+4+(26*i);break;
                case"E": num=num+5+(26*i);break;
                case"F": num=num+6+(26*i);break;
                case"G": num=num+7+(26*i);break;
                case"H": num=num+8+(26*i);break;
                case"I": num=num+9+(26*i);break;
                case"J": num=num+10+(26*i);break;
                case"K": num=num+11+(26*i);break;
                case"L": num=num+12+(26*i);break;
                case"M": num=num+13+(26*i);break;
                case"N": num=num+14+(26*i);break;
                case"O": num=num+15+(26*i);break;
                case"P": num=num+16+(26*i);break;
                case"Q": num=num+17+(26*i);break;
                case"R": num=num+18+(26*i);break;
                case"S": num=num+19+(26*i);break;
                case"T": num=num+20+(26*i);break;
                case"U": num=num+21+(26*i);break;
                case"V": num=num+22+(26*i);break;
                case"W": num=num+23+(26*i);break;
                case"X": num=num+24+(26*i);break;
                case"Y": num=num+25+(26*i);break;
                case"Z": num=num+26+(26*i);break;
            }
            i++;
        }
return num;
    }

}
