class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       Deque<Integer> queue  = new ArrayDeque<>();
       int n = nums.length;
       int[] result = new int[n-k+1];
       int j=0;
       for(int i=0; i<n; i++){
            while(!queue.isEmpty() && nums[i] > nums[queue.getLast()]){
                queue.removeLast();
            }
            queue.add(i);
            if(i-k >= queue.getFirst()) queue.removeFirst();
            if(i >= k-1) result[j++] = nums[queue.getFirst()];
            
       } 
       return result;
    }
}