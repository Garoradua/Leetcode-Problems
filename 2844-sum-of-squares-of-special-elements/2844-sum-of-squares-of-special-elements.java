class Solution {
    public int sumOfSquares(int[] nums) {
        int length = nums.length;
        int result = 0;
        for(int i=0; i<length; i++){
            int x = i+1;
            if((length%x)==0) {
               x = nums[i]*nums[i];
                result += x;
            }
        }
        return result;
    }
}