class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i;
        for(i=0; i<n; i++){
            if(nums[i]>=0) break;
        }
        int left;
        int right;
        left = i-1;
        right = i;
        int data;
        int j = 0;
        int[] result = new int[n];
        while(left >=0 && right<n){
            if(Math.abs(nums[left]) < nums[right]){
                data = nums[left];
                result[j++] = data*data;
                left--;
            }else{
                data = nums[right];
                result[j++] = data*data;
                right++;
            }
        }
        while(left >=0){
            data = nums[left];
            result[j++] = data*data;
            left--;
        }
        while(right < n){
            data = nums[right];
            result[j++] = data*data;
            right++;
        }
        return result;
    }
}