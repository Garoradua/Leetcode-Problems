class Solution {
    public int longestOnes(int[] nums, int k) {
        int right=0; 
        int left=0;
        int maxConsecutive = 0;
        int window = 0;
        for(right=0; right < nums.length; right++){
            window += nums[right];
            while(window + k < right-left+1){
               window  = window - nums[left];
               left++; 
            }
            maxConsecutive  =Math.max(maxConsecutive, right-left + 1);
        }
        return maxConsecutive;
    }
}