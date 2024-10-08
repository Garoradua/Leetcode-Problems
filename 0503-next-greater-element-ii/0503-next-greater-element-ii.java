class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] result = new int[n];
        for(int i=2*n-1; i>=0; i--){
            while(!st.isEmpty() && nums[i%n]>=st.peek()) st.pop();
            if(i<n){
                result[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(nums[i%n]);
        }
        // for(int i = n-1; i>=0; i--){
        //     while(!st.isEmpty() && nums[i]>=st.peek()) st.pop();
            
        // }
        return result;
    }
}