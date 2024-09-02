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
        ArrayList<Integer> list2 = new ArrayList<Integer>(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(list2);
        for(int i=0; i<list.size(); i++){
            if(list.get(i)!=list2.get(i)) return false;
        }
        return true;
    }
}