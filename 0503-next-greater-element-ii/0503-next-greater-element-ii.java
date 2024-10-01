class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && nums[i]>st.peek()) st.pop();
            st.push(nums[i]);
        }
        int[] result = new int[n];
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && nums[i]>=st.peek()) st.pop();
            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return result;
    }
}