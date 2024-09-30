class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=n2-1; i>=0; i--){
            int val = nums2[i];
            while(st.size()>=1 && val > st.peek()) st.pop();
            if(st.isEmpty())  mp.put(val, -1);
            else  mp.put(val, st.peek());
            st.push(val);
        }
        int[] result2 = new int[n1];
        for(int i=0; i<n1; i++){
            result2[i] = mp.get(nums1[i]);
        }
        return result2;
    }
}