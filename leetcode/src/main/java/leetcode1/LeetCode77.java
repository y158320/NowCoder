package leetcode1;

import java.util.ArrayList;
import java.util.List;

public class LeetCode77 {

    List<List<Integer>> res = new ArrayList<>();
    int count;
    int length;
    public List<List<Integer>> combine(int n, int k) {
        if(k > n) {
            return res;
        }
        count = n;
        length = k;
        foo(1, new ArrayList());
        return res;
    }

    public void foo(int index, List<Integer> list) {
        int tmp = list.size() != 0 ? list.get(list.size() - 1) +1 : 1;
        for (int i = tmp; i <= index + count - length; i++) {
            List<Integer> tmpList = new ArrayList<>(list);
            tmpList.add(i);
            if (index == length) {
                res.add(tmpList);
            } else {
                foo(index + 1, tmpList);
            }
        }
    }

}
