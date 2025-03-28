/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        ListNode preTail = dummy;
        ListNode curhead=head;
        while(curhead!=null){
            ListNode curTail=findTailAfterK(curhead,k);
            if(curTail==null) break;
            ListNode nexthead=curTail.next;
            reversektime(curhead,k);
            preTail.next=curTail;
            preTail=curhead;
            curhead=nexthead;
        }
        preTail.next=curhead;
        return dummy.next;
    }

    static ListNode reversektime(ListNode head, int k){
        if(head==null || head.next==null) return head;

        ListNode pre=null;
        ListNode cur=head;
        int count=0;
        while(count<k && cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
            count++;
        }
        return pre;
    }

    static ListNode findTailAfterK(ListNode head,int k){
        for(int i=0;i<k-1;i++){
            head=head.next;
            if(head==null) return null;
        }
        return head;
    }

}