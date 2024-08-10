class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]) {
                    list.add(nums2[j]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] result = new int[list.size()];
        int i=0;
        for(int num: list){
            result[i++] = num;
        }
        return result;

    }
}