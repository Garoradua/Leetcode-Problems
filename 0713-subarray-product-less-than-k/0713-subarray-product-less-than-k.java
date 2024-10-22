class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int product = 1;
        int count = 0;
        while(start < nums.length){
            product *= nums[end];
            if(product < k){
                count++;
                end++;
            }else{
                start++;
                end = start;
                product = 1;
            }

            if(end==nums.length){
                start++;
                end = start;
                product = 1;
            }
        }

        return count;
    }
}