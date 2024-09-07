class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high  = arr.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return mid;
            else if(arr[mid+1] > arr[mid]) low = mid+1;
            else if(arr[mid]<arr[mid-1]) high = mid-1;
        }
        return -1;
    }
}