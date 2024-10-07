class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res= 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int x : nums){
            sum += x%2;
            if(map.containsKey(sum-k)) res+= map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }


        return res;
    }
}