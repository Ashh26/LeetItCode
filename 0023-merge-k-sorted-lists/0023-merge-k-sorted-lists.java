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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1,o2)->o1.val-o2.val);

        for(ListNode head:lists){
            if(head!=null) pq.add(head);
        }

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(!pq.isEmpty()){
            tail.next=pq.poll();
            tail=tail.next;

            if(tail.next!=null){
                pq.add(tail.next);
            }
        }
        return dummy.next;
    }
}