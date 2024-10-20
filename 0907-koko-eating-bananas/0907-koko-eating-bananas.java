class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int n = piles.length;
        int right = findMaximum(piles);
        long count  = 0;
        int result = 0;
        while(left<=right){
            int mid = left + (right-left)/2;
            count = 0;
            for(int i=0; i<n; i++){
                count += (piles[i]+(mid-1))/mid;
            }
            if(count<=h) {
                result = mid;
                right = mid-1;
            }
            else left = mid+1;
        }

        return result;
    }

    public int findMaximum(int[] piles){
        int maximum = piles[0];

        for(int i=1; i<piles.length; i++){
            maximum = Math.max(maximum, piles[i]);
        }
        return maximum;
    }
}