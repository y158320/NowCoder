package leetcode1;


import org.junit.Test;

/**
 * 942题
 */
public class LeetCode942 {

    @Test
    public void say()
    {
        int[] a=diStringMatch("DDI");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }

    public void say1(String S)
    {

    }

    public int[] diStringMatch(String S) {
        int max = S.length();
        int len = S.length();
        int min = 0;
        int[] ans = new int[max+1];
        for(int i = 0;i < len;i++){
            char c = S.charAt(i);
            if(c == 'D'){
                ans[i] = max--;
            }else{
                ans[i] = min++;
            }
        }
        ans[len] = max;
        return ans;
    }

    public int[] diStringMatch1(String S) {
        int len = S.length();
        char[] s = S.toCharArray();
        int[] res = new int[len+1];
        for(int i=len-1; i>=0; i--){
            if(s[i]=='D'){
                int max=0;
                for(int j=i+1;j<len+1;j++){
                    if(max<res[j])
                        max = res[j];
                }
                res[i]=max+1;
            }else{
                for(int j=i+1;j<len+1;j++){
                    res[j]=res[j]+1;
                }
                res[i]=0;
            }
        }
        return res;
    }

}
