class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int n = nums.length;
        int maximum = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                count++;
                maximum = Math.max(count, maximum);
            }else count = 0;
        }
        return maximum;
    }
}