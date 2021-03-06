/**
 * Created by YGZ on 2016/2/23.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode p = new ListNode(0);
        ListNode head = p;
        while(l1!=null&&l2!=null){
            if (l1.val<l2.val){
                head.next = l1;
                l1 = l1.next;
            }else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        if (l1 == null){
            head.next = l2;
        }else {
            head.next = l1;
        }
        return p.next;
    }
}
