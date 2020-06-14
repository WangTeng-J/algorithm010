package Week01;

public class MergeTwoLists {


    /**
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            //小节点放在最前
            if (l1.val <= l2.val) {
                //头节点指向小的节点
                prev.next = l1;
                // 移动节点指针
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        // 合并后 l1 和 l2 最多只有一个还未被合并完
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;



    }
}
