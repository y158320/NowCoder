package leetcode1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 *
 * 示例1:
 *
 *  输入：[1, 2, 3, 3, 2, 1]
 *  输出：[1, 2, 3]
 * 示例2:
 *
 *  输入：[1, 1, 1, 1, 2]
 *  输出：[1, 2]
 * 提示：
 *
 * 链表长度在[0, 20000]范围内。
 * 链表元素在[0, 20000]范围内。
 *
 */
public class mianshi02_01 {

    @Test
    public void say()
    {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(3);
        ListNode listNode5=new ListNode(2);
        ListNode listNode6=new ListNode(1);
        listNode5.next=listNode6;
        listNode4.next=listNode5;
        listNode3.next=listNode4;
        listNode2.next=listNode3;
        listNode1.next=listNode2;
        removeDuplicateNodes(listNode1);
    }

    public ListNode removeDuplicateNodes(ListNode head) {
      if (head==null)
      {
          return null;
      }
      List<Integer> list=new ArrayList<>();
      list.add(head.val);
      dfs(head.next,list);
      return head;
    }

    public void dfs(ListNode head, List<Integer> list)
    {
        if (head==null)
        {
            return;
        }
        if (list.contains(head.val))
        {
            head=head.next;
        }else
        {
            list.add(head.val);
        }
        dfs(head.next,list);
    }

}
