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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode original=head;
        ListNode newHead=null;
        ListNode temp=head;

        while(original!=null){
            while(original.next!=null && original.val==original.next.val){
                original=original.next;
            }
            if(newHead==null){
                newHead=temp=original;
            }else{
                temp.next=original;
                temp=original;
            }
            original=original.next;
        }
        return newHead;
    }
}