class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        List<Character> list = new ArrayList<>();
        int length = 0;
        while(start<s.length() && end < s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(Character.valueOf(s.charAt(end)));
                end++;
                length = Math.max(length, end-start);
            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return length;
    }
}