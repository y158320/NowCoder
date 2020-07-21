package leetcode1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定三个字符串 s1, s2, s3, 验证 s3 是否是由 s1 和 s2 交错组成的。
 *
 * 示例 1:
 *
 * 输入: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
 * 输出: true
 * 示例 2:
 *
 * 输入: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
 * 输出: false
 *
 */
public class LeetCode97 {

    @Test
    public void say()
    {
        System.out.println(isInterleave1("a","","c"));
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())
        {
           return false;
        }
        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        List<String> list3=new ArrayList<>();
        for (int i=0;i<s1.length();i++)
        {
            list1.add(s1.substring(i,i+1));
        }
        for (int i=0;i<s2.length();i++)
        {
            list2.add(s2.substring(i,i+1));
        }
        for (int i=0;i<s3.length();i++)
        {
            list3.add(s3.substring(i,i+1));
        }
        while (list1.size()!=0 && list2.size()!=0 && list3.size()!=0)
        {
            if (list1.contains(list3.get(0)))
            {
                list1.remove(list3.get(0));
                list3.remove(list3.get(0));
                break;
            }else if (list2.contains(list3.get(0)))
            {
                list2.remove(list3.get(0));
                list3.remove(list3.get(0));
                break;
            }else
            {
                return false;
            }
        }
        return true;
    }



    public boolean isInterleave1(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())
        {
            return false;
        }
        if (s1.length()==0)
        {
            if (s2.equals(s3))
            {
                return true;
            }else {
                return false;
            }
        }
        if (s2.length()==0)
        {
            if (s1.equals(s3))
            {
                return true;
            }else {
                return false;
            }
        }
        char[] chars1=s1.toCharArray();
        char[] chars2=s2.toCharArray();
        char[] chars3=s3.toCharArray();
        int count1=0;
        int count2=0;
        int count3=0;
        while (count1!=chars1.length && count2!=chars2.length && count3!=chars3.length){
            if (chars1[count1]==chars3[count3])
            {
                count1++;
                count3++;
            }else if(chars2[count2]==chars3[count3])
            {
                count2++;
                count3++;
            }else {
                return false;
            }
        }
        return true;
    }

}
