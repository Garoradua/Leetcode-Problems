class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int i=0;
        int j=0;
        int maxLength = 0;
        while(j<s.length()){
            if(list.contains(Character.valueOf(s.charAt(j)))){
                while(list.contains(Character.valueOf(s.charAt(j)))){
                    list.remove(Character.valueOf(s.charAt(i)));
                    i++;
                }
                list.add(Character.valueOf(s.charAt(j)));
            }else{
                list.add(Character.valueOf(s.charAt(j)));
                maxLength = Math.max(maxLength, j-i+1);
            }
            j++;
        }
        return maxLength;
    }
}