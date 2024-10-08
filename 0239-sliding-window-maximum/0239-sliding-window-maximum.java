class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        Deque<Integer> deq = new ArrayDeque<>();
        int j = 0;
        for(int i=0; i<nums.length; i++){
            while(!deq.isEmpty() && nums[deq.getLast()] <= nums[i]){
                deq.removeLast();
            }
            deq.addLast(i);
            if(deq.getFirst()+k == i) deq.removeFirst();
            if(i >= k-1) {
                result[j++] = nums[deq.getFirst()];
            }
        }
        return result;
    }
}