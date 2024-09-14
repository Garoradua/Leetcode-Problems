class Solution {
    public int longestSubarray(int[] nums) {
        int maximum = 0;
        for(int i=0; i<nums.length; i++){
            maximum = Math.max(maximum, nums[i]);
        }
        int count = 0;
        int ans = 0;

        for(int i=0; i<nums.length; i++){
           if(nums[i]==maximum) {
            count++;
           }
           else {
            count = 0;
           }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}