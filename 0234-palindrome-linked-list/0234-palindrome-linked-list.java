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
        // if(head==null) return false;
        // ListNode curr = head;
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // while(curr!=null){
        //     list.add(curr.val);
        //     curr = curr.next;
        // }
        // int left = 0;
        // int right = list.size()-1;

        // while(right >= left){
        //     if(list.get(left) != list.get(right)) return false;
        //     left++;
        //     right--;
        // }
        // return true;

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        ListNode secondHalf = reverse(slowPointer);
        ListNode firstHalf = head;
        boolean isPallindrome = true;
        while(secondHalf!=null){
            if(firstHalf.val != secondHalf.val) {
                isPallindrome =  false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        reverse(secondHalf);
        return isPallindrome;

    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode nextnode = null;
        ListNode curr = head;

        while(curr!=null){
            nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        return prev;
    }
}