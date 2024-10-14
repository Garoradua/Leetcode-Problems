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
        Deque<Integer> smaller = new ArrayDeque<>();
        Deque<Integer> greater = new ArrayDeque<>();
        ListNode curr = head;
        while(curr!=null){
            if(curr.val < x) smaller.addLast(curr.val);
            else greater.addLast(curr.val);

            curr = curr.next;
        }
        curr = head;
        while(!smaller.isEmpty()){
            curr.val = smaller.removeFirst();
            curr = curr.next;
        }
        while(!greater.isEmpty()){
            curr.val = greater.removeFirst();
            curr = curr.next;
        }

        return head;
    }
}