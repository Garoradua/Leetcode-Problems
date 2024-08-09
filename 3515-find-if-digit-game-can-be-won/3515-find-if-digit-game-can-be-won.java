class Solution {
    public boolean canAliceWin(int[] nums) {
       int singleDigit = 0;
       int doubleDigit = 0;
       for(int i=0; i<nums.length; i++){
            if(nums[i] >= 10) {
                doubleDigit += nums[i];
            }
            else singleDigit += nums[i];
       }

       return singleDigit!=doubleDigit;
    }
}