class Solution {
    public int removeDuplicates(int[] nums) {
        int newPlace = 0;
        for(int i=1; i<nums.length; i++){
           if(nums[newPlace]!=nums[i]){
            newPlace++;
            nums[newPlace] = nums[i];
           }
        }
        return newPlace+1;
    }
}