package Leetcode.Simple100;

import java.util.HashSet;
import java.util.Set;

/**
 * 环形链表
 */
public class Leetcode141 {
    private ListNode head = new ListNode(3, new ListNode(2,
            new ListNode(0, new ListNode(-4))));
    private int pos = 1;

    // 哈希表
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    // 快慢指针
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    public void test(){
        System.out.println(hasCycle(this.head));
        System.out.println(hasCycle2(this.head));
    }
    public static void main(String[] args){
        Leetcode141 lt = new Leetcode141();
        lt.test();
    }


}
