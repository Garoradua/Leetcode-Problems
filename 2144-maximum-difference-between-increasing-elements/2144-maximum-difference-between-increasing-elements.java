class Solution {
    public int maximumDifference(int[] nums) {
        int minimum = nums[0];
        int n = nums.length;
        int maxDiff = -1;
        for(int i=1; i<n; i++){
            if(nums[i] > minimum) {
                maxDiff = Math.max(maxDiff, nums[i]-minimum);
            }
            minimum = Math.min(minimum, nums[i]);
        }

        return maxDiff;
    }
}