class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int[] result = new int[2];
        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]==target){
                int smaller = mid;
                while(smaller>start && target==nums[smaller-1]){
                    smaller--;
                }
                result[0] = smaller;
                int larger = mid; 
                while(larger<end && target==nums[larger+1]){
                    larger++;
                }
                result[1] = larger;

                return result;

            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return new int[]{-1,-1};
    }
}