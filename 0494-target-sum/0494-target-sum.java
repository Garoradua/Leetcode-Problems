class Solution {
    public static int findWays(int[] nums, int totalSum, int currentPointer, int target){
        if(currentPointer == 0){
            int ways = 0;
            if(totalSum + nums[currentPointer] == target) ways++;
            if(totalSum - nums[currentPointer] == target) ways++;

            return ways;
        }
        int addition =  findWays(nums, totalSum + nums[currentPointer], currentPointer-1, target);
        int subtraction =  findWays(nums, totalSum - nums[currentPointer], currentPointer-1, target);

        return addition+subtraction;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return findWays(nums, 0, nums.length-1, target);
    }
}