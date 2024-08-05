class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            int j = i+1;
           while(j<n){
            int k = j+1;
            while(k<n){
                if((Math.abs(arr[i]-arr[j])<=a) && (Math.abs(arr[j]-arr[k])<=b) && (Math.abs(arr[i]-arr[k])<=c) ) count++;
                k++;
            }
            j++;
           }
        }
        return count;
    }
}