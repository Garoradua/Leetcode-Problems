class Solution {
    public int[] numberGame(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i=i+2){
            sum = nums[i] + nums[i+1];
            nums[i] = sum - nums[i];
            nums[i+1] = sum - nums[i+1];
            sum = 0;
        }
        return nums;
    }
}