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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode shead=new ListNode(-1);
        ListNode lhead=new ListNode(-1);

        ListNode stail=shead;
        ListNode ltail=lhead;
        ListNode cur=head;
        
        while(cur!=null){
            if(cur.val<x){
                stail.next=cur;
                stail=cur;
            }else{
                ltail.next=cur;
                ltail=cur;
            }
            cur=cur.next;
        }
        stail.next=lhead.next;
        ltail.next=null;
        return shead.next;
    }
}