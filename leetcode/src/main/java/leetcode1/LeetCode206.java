package leetcode1;

import org.junit.Test;

import java.util.List;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 */
public class LeetCode206 {

    @Test
    public void say()
    {
        ListNode head1=new ListNode(1);
        ListNode head2=new ListNode(2);
        ListNode head3=new ListNode(3);
        ListNode head4=new ListNode(4);
        ListNode head5=new ListNode(5);
        head4.next=head5;
        head3.next=head4;
        head2.next=head3;
        head1.next=head2;
        reverseList1(head1);
    }

    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public ListNode reverseList1(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode listNode=null;
        while (head!=null)
        {
            ListNode listNode1=new ListNode(head.val);
            listNode1.next=listNode;
            listNode=listNode1;
            head=head.next;
        }
        return listNode;
    }

}
