class Solution {
    public int minSwaps(int[] nums) {
       int totalOnes = 0;
       int n = nums.length;
       for(int no : nums){
        if(no==1) totalOnes++;
       } 
        int start=0;
        int end = 0;
        int currOnes=0;
        int maxOnes = 0;
       while(end < 2*n){
            currOnes += nums[end%n];

            if(end-start+1 > totalOnes){
                currOnes -= nums[start%n];
                start++;
            }

            maxOnes = Math.max(maxOnes, currOnes);
            end++;
       }

       return totalOnes-maxOnes;
    }
}