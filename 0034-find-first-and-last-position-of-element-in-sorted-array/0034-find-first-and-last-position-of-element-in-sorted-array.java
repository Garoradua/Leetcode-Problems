class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        
        result[0] = firstOccurence(nums, target);
        result[1] = secondOccurence(nums, target);

        return result;
    }

    public int firstOccurence(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int result = -1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]==target){
                result = mid;
                end = mid-1;
            }else if(nums[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return result;
    }

    public int secondOccurence(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int result = -1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]==target){
                result = mid;
                start = mid+1;
            }else if(nums[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return result;
    }
}