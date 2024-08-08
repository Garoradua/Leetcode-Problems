class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
       for(int i=0; i<nums1.length; i++){
        for(int j=0; j<nums2.length; j++){
            if(nums1[i]==nums2[j]) s.add(nums2[j]);
        }
       }
       int len = s.size();
       int[] result = new int[len];
       int i=0;
       for(int num : s){
        result[i++] = num;
       }
       return result;
    }
}