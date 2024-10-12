class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = n-1;

            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                    while(j<k && nums[j]==nums[j-1]) j++;
                }else{
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while(j<k && nums[j]==nums[j-1]) j++;
                }
            }
        }
        return result;
    }
}