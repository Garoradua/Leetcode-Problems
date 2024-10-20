class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 1;
        int right = findMaximum(candies);
        int n = candies.length;
        int result = 0;
        long count = 0;
        while(left<=right){
            int mid = left + (right-left)/2;
            count = 0;
            for(int candie : candies) count += candie/mid;
            if(count>=k){
                result = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return result;
    }

    public int findMaximum(int[] candies){
        int maximum = candies[0];
        for(int i=1; i<candies.length; i++) maximum = Math.max(maximum, candies[i]);

        return maximum;
    }
}