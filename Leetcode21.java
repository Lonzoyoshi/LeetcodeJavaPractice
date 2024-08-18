package Leetcode.SimpleQus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 合并两个有序链表
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val; this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

public class Leetcode21 {
    private ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(4)));
    private ListNode l2 = new ListNode(1,new ListNode(4, new ListNode(6)));
    Leetcode21(){}
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        List<Integer> list = new ArrayList<>();
        while (l1 != null){
            list.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            list.add(l2.val);
            l2 = l2.next;
        }
        Collections.sort(list);
        ListNode vo = new ListNode();
        ListNode nextVo = vo;
        for (Integer i : list){
            nextVo.next = new ListNode(i);
            nextVo = nextVo.next;
        }
        return vo.next;
    }
    public ListNode TwoPointer(ListNode l1, ListNode l2){
        ListNode dum = new ListNode(0), cur = dum;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }
            else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }
    public void test(){
        ListNode result = mergeTwoLists(this.l1,this.l2);
        ListNode result2 = TwoPointer(this.l1, this.l2);
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while (result!=null){
            list.add(result.val);
            list2.add(result2.val);
            result = result.next;
            result2 = result2.next;
        }
        System.out.println(list.toString());
        System.out.println(list2.toString());
    }
    public static void main(String[] args){
        Leetcode21 test = new Leetcode21();
        test.test();
    }
}
