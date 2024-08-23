class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int mid = n/2;
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum += Math.abs(nums[i]- nums[mid]);
        }
        return sum;
    }
}