class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=1; i<n; i=i+2){
            if(nums[i]!=nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[n-1];
    }
}