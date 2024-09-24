class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        generateCombination(0, candidates, list, new ArrayList(), target);
        return list;
    }

    public static void generateCombination(int start, int[] candidates, List<List<Integer>> result, List<Integer> temp, int target){
        if(target==0){
            result.add(new ArrayList(temp));
            return;
        }
        if(target<0) return;
        for(int i=start; i<candidates.length; i++){
            if(i>start && candidates[i]==candidates[i-1]) continue;
            temp.add(candidates[i]);
            generateCombination(i+1, candidates, result, temp, target-candidates[i]);
            temp.remove(temp.size()-1);
        }
    }

}