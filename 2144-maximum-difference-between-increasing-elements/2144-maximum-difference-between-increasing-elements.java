class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int[] minArray = new int[n];
        int[] maxArray = new int[n];

        minArray[0] = nums[0];
        for(int i=1; i<n; i++){
            minArray[i] = Math.min(minArray[i-1], nums[i]);
        }

        maxArray[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            maxArray[i] = Math.max(maxArray[i+1], nums[i]);
        }

        int maxDiff = -1;

        for(int i=0; i<n; i++){
            if(maxArray[i]-minArray[i] !=0)
            maxDiff = Math.max(maxDiff, maxArray[i]-minArray[i]);
        }

        return maxDiff;
    }
}