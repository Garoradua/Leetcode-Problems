class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums1){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int n: nums2){
            if(map.containsKey(n)){
                if(map.get(n) > 0){
                    list.add(n);
                    map.put(n, map.getOrDefault(n, 0)-1);
                }
            }
        }
        int arr[] = new int[list.size()];

        for(int i=0; i<arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}