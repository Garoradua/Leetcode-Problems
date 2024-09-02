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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        ListNode curr = head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(curr!=null){
            list.add(curr.val);
            curr = curr.next;
        }
        int left = 0;
        int right = list.size()-1;

        while(right >= left){
            if(list.get(left) != list.get(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}