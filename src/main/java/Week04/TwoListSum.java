package Week04;

import java.util.Map;
import java.util.Stack;

/**
 * @CLASSNAME:TwoListSum
 * @AUTHOR: wangteng
 * @TIME: 2020-07-0116:44
 */
public class TwoListSum {

    //9-》1-》2   219


    public static void main(String[] args) {
//        ListNode l1= new ListNode(5);
//
//        ListNode a1= new ListNode(5);
//
//        ListNode listNode = addTwoNumbers(l1, a1);
//
//        while (listNode!= null){
//            System.out.println(listNode.val);
//            listNode = listNode.next;
//        }
        String s1 = "z";
        char c = s1.charAt(0);

        char m = 128;
        System.out.println(m);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> sumStack = new Stack<>();
        boolean moreFlag = false;
        while(l1 != null || l2!= null){
            int sum = 0;
            if(null != l1){
                sum += l1.val;
                l1 = l1.next;
            }
            if(null != l2){
                sum += l2.val;
                l2 = l2.next;
            }
            if(moreFlag){
                sum += 1;
                moreFlag = false;
            }
            if(sum>=10){
                sumStack.push(sum%10);
                moreFlag = true;
            }else {
                sumStack.push(sum);
            }
        }
        if(moreFlag){
            sumStack.push(1);
        }


        if(! sumStack.isEmpty()){
            ListNode head = new ListNode(sumStack.pop());
            ListNode pre = head;
            while (! sumStack.isEmpty()){
                ListNode newN = new ListNode(sumStack.pop());
                pre.next = newN;
                pre = newN;
            }

            return resNode(head);

        }else{
            return new ListNode(0);
        }

    }


    private  static ListNode resNode(ListNode node){
        ListNode pre = null;
        ListNode curr = node;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }

        return pre;

    }


}
