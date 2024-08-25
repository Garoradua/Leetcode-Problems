class Solution {
    public static int check(int start, int end, int[] nums){
        for(int i=start+1; i<=end; i++){
            if(nums[i-1]+1 != nums[i])
                return -1;
        }
        return nums[end];
    }
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];
        int pos=0;
        for(int i=0; i<=n-k; i++){
            int number = check(i, i+k-1, nums);
            result[pos] = number;
            pos = pos+1;
        }
        return result;
    }
}