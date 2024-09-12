class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1) return nums[0];

        int low = 0;
        int high = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[low] <= nums[high]){
                ans = Math.min(ans, nums[low]);
                break;
            }
            else if(nums[mid] >= nums[low]) low = mid+1;
            else{
                ans = Math.min(ans, nums[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}