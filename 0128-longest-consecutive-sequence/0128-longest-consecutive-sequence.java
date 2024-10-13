class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n : nums) set.add(n);
        int setSize = set.size();

        if(setSize==0) return 0;
        else if(setSize==1) return 1;
        int maxLength = 1;
        int count = 0;
         int length = 1;
        for(int n : set){
            if(!set.contains(n-1)){
                length = 1;
                while(set.contains(n+length)){
                    length++;
                }

            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}