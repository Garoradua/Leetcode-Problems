class Solution {
    public static int findMin(int[] nums){
        int minimum = nums[0];
        for(int i=1; i<nums.length; i++){
            minimum = Math.min(minimum, nums[i]);
        }
        return minimum;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0; i<k; i++){
            int minimum = findMin(nums);
            for(int j=0; j<nums.length; j++){
                if(nums[j]==minimum) {
                    nums[j] = nums[j]*multiplier;
                    break;
                }
            }
        }
        return nums;
    }
}