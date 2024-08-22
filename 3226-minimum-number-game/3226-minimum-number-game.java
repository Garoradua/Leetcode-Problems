class Solution {
    public int[] numberGame(int[] nums) {
        // int sum = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i=i+2){
            nums[i] = nums[i] + nums[i+1];
            nums[i+1] = nums[i] - nums[i+1];
            nums[i] = nums[i] - nums[i+1];
        }
        return nums;
    }
}