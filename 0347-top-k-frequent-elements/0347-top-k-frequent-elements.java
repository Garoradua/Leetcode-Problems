class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int key : map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency]==null) bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);
        }
        int j=0;
        int[] result = new int[k];
        for(int i=bucket.length-1; i>=0 && j< k; i-- ){
            if(bucket[i]!=null){
                for(Integer val : bucket[i]){
                    result[j++] = val;
                }
            }
        }
        return result;
    }
}