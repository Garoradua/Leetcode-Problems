class Solution {
    public int[] runningSum(int[] nums) {
        int[] newNums = new int[nums.length];
        newNums[0]= nums[0];
        for(int i=1; i<nums.length; i++){
            newNums[i] = newNums[i-1] + nums[i];
        }
        return newNums;
    }
}