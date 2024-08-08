class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s = new HashSet<>();
        for(int num : nums1){
                s1.add(num);
            }
        for(int num : nums2){
                s2.add(num);
            }
        for(int num : s1){
            if(s2.contains(num)){
                s.add(num);
            }
        }
        int size = s.size();
        int i=0;
        int[] result = new int[size];
        for(int num : s){
            result[i++] = num;
        }
        return result;
    }
}