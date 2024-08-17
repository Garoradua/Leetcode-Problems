class Solution {
    public static void backtracking(List<List<Integer>> resultList, List<Integer> temp, int[] nums, int start){
        resultList.add(new ArrayList<>(temp));
        for(int i=start; i<nums.length; i++){
            temp.add(nums[i]);
            backtracking(resultList, temp, nums, i+1);
            temp.remove(temp.size()-1);
            // backtracking(resultList, temp, nums, start+1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtracking(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }
}