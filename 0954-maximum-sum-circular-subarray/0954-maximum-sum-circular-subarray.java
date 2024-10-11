class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int n = nums.length;
        int normalMax = findMaximum(nums);
        if(normalMax < 0) return normalMax;
        int totalSum = 0;
        for(int i= 0; i<n; i++){
            totalSum += nums[i];
            nums[i] = -nums[i];
        }
        int secondnormalMax = findMaximum(nums);
       int circularMax =  totalSum + secondnormalMax;

       return Math.max(circularMax, normalMax);

    }

    public int findMaximum(int[] nums){
        int n = nums.length;
        int res = nums[0];
        int maximum = nums[0];
        for(int i=1; i<n; i++){
            maximum = Math.max(maximum+nums[i], nums[i]);
            res = Math.max(res, maximum);
        }
        return res;
    }
}