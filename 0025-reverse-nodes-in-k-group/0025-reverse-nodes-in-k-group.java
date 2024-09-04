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
        if(head==null) return null;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        int c = k;
        while(curr!=null && c>0){
             next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c--;
        }
        if(c>0){
            curr = prev;
            prev= null;
           while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } 
        if(c>0) return prev;
        }
        head.next = reverseKGroup(curr, k);
        return prev;
    }
}