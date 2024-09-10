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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;
        while(curr!=null && curr.next!=null){
            ListNode nextPair = curr.next.next;
            ListNode second = curr.next;

            //swap
            curr.next = second.next;
            second.next = curr;
            prev.next = second;
            //
            prev = curr;
            curr = nextPair;

        }
        return dummy.next;
    }
}