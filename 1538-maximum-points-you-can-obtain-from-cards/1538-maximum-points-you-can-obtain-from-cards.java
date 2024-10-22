class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;

        for(int i=0; i<k; i++){
            leftSum += cardPoints[i];
        }

        maxSum = leftSum;
        int end = cardPoints.length-1;
        for(int i=k-1; i>=0; i--){
            leftSum = leftSum - cardPoints[i];
            leftSum += cardPoints[end];
            end--;

            maxSum = Math.max(leftSum, maxSum);
        }

        return maxSum;
    }
}