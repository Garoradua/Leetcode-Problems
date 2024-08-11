class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maximum = 0;
        int window = 0;
        int left = 0;
        for(int right=0; right<n; right++){
            window += nums[right];
                while(right - left + 1 != window){
                    window -= nums[left];
                    left++;
            }
            maximum = Math.max(right-left+1, maximum);
        }
        return maximum;
    }
}