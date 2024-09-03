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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        int length = 0;
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            length++;
            prev = curr;
            curr = curr.next;
        }
        if(k==length) return head;
        prev.next = head;
        curr = head;

        if(k>length){
            k = k%length;
        }
        int jump = length - k;
        jump--;
        while(jump>0){
            curr = curr.next;
            jump--;
        }
        head = curr.next;
        curr.next = null;
        return head;
    }
}