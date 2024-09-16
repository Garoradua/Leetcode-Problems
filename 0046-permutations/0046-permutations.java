class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutations(nums, 0, nums.length-1, ans);
        return ans;
    }
    public static void permutations(int[] nums, int l, int r, List<List<Integer>> ans){
        if(l==r){
            List<Integer> temp = new ArrayList<>();
            for(int num: nums){
                temp.add(num);
            }
            ans.add(temp);
        } 
        else{
        for(int i=l; i<=r; i++){
           nums =  swap(i,l,nums);
            permutations(nums, l+1, r, ans);
            nums =  swap(i,l,nums);
        }
        }
    }
    public static int[] swap(int l, int r, int[] nums){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
        return nums;
    }
}