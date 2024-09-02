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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode os = null, oe = null, es = null, ee = null;
        ListNode curr= head;
        int pos =1;
        while(curr!=null){
            if(pos%2 == 0){
                if(es==null){
                    es = ee = curr;
                }else{
                    ee.next = curr;
                    ee = curr;
                }
            }else{
                if(os==null){
                    os = oe = curr;
                }else{
                    oe.next = curr;
                    oe = curr;
                }
            }
            curr = curr.next;
            pos++;
        }
        if(os==null || es == null) return head;
        oe.next = es;
        ee.next = null;
        return os;
    }
}