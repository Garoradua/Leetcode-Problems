class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
           while(!queue.isEmpty() && nums[queue.getLast()] < nums[i]){
                queue.removeLast();
           }
           queue.addLast(i);
           if(i-k >= queue.getFirst()) queue.removeFirst();
           if(i >= k-1) list.add(nums[queue.getFirst()]);
        }

        int[] result = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}