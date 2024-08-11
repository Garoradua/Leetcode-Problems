class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0; 
        int j=0;
        int maxConsecutive = 0;
        int count = 0;
        
        while(i<nums.length){
            j = i;
            int flips = k;
            while(j<nums.length){
                if(nums[j]==1) count++;
                else if(flips!=0){
                    count++;
                    flips--;
                }else break;
                j++;
            }
            maxConsecutive = Math.max(maxConsecutive, count);
            count = 0;
            if(j==nums.length) break;
            i++;
        }
        return maxConsecutive;
    }
}