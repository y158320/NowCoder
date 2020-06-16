package leetcode1;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode297 {

    @Test
    public void say()
    {
        System.out.println("11217");
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder res = ser_help(root, new StringBuilder());
        return res.toString();
    }

    public StringBuilder ser_help(TreeNode root, StringBuilder str)
    {
        if (root==null)
        {
            str.append("null");
            str.append(",");
            return str;
        }
        ser_help(root.left,str);
        ser_help(root.right,str);
        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] str_word = data.split(",");
        List<String> list_word = new LinkedList<String>(Arrays.asList(str_word));
        return deser_help(list_word);
    }

    public TreeNode deser_help(List<String> li){
        if(li.get(0).equals("null")){
            li.remove(0);
            return null;
        }
        TreeNode res = new TreeNode(Integer.valueOf(li.get(0)));
        li.remove(0);
        res.left = deser_help(li);
        res.right = deser_help(li);
        return res;
    }

}
