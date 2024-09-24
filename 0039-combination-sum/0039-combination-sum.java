class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombination(0, candidates, new ArrayList(), result, target);
        return result;
    }
    public static void generateCombination(int start, int[] candidates, List<Integer> temp, List<List<Integer>> result, int target){
        if(target==0){
        result.add(new ArrayList(temp));
        return;
        }
        if(target<0) return;

        for(int i= start; i<candidates.length; i++){
            temp.add(candidates[i]);
            generateCombination(i, candidates, temp, result, target-candidates[i]);
            temp.remove(temp.size()-1);
        }
    }
}