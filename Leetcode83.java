package Leetcode.SimpleQus;

/**
 * 删除排序链表中的重复元素
 */
public class Leetcode83 {
    private ListNode head = new ListNode(1,new ListNode(1,new ListNode(1,
            new ListNode(1,new ListNode(1)))));
    public ListNode deleteDuplicates(ListNode head) {
        if  (head == null){
            return head;
        }
        ListNode cur = head;
        while (cur.next != null){
            if (cur.next != null){
                if (cur.val == cur.next.val){
                    cur.next = cur.next.next;
                }
                else{
                    cur = cur.next;
                }
            }
        }
        return head;
    }
    public void test(){
        deleteDuplicates(this.head);
        ListNode p = this.head;
        while (p!=null){
            System.out.print(p.val);
            System.out.print(' ');
            p=p.next;
        }
    }
    public static void main(String[] args){
        Leetcode83 lt = new Leetcode83();
        lt.test();
    }
}
