class Solution {
    public static int[] findMinandMax(int[] bloomDay){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int val: bloomDay){
            min = Math.min(val,min);
            max = Math.max(val,max);
        }
        return new int[]{min, max};
    }
    public static boolean isPossible(int thatDay, int k, int m, int[] bloomDay){
        int count = 0;
        int total = 0;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i]<=thatDay) count++;
            else count = 0;

            if(count>=k){
                total++;
                count = 0;
            }
            if(total >=m ) return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {

        if((long)m*k > bloomDay.length) return -1;
        int[] range = findMinandMax(bloomDay);
        int start = range[0];
        int end = range[1];
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isPossible(mid, k, m, bloomDay)){
                ans = mid;
                end = mid-1;
            }else{
                 start = mid+1;
            }
        }
        return ans;
    }
}