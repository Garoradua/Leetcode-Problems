class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] string1 = new int[26];
        int[] string2 = new int[26];
        if(s2.length() < s1.length()) return false;
        for(int i=0; i<s1.length(); i++){
            string1[s1.charAt(i)-'a']++;
            string2[s2.charAt(i)-'a']++;
        }

        for(int i=0; i<s2.length()-s1.length(); i++){
            if(Arrays.equals(string1, string2)) return true;
            string2[s2.charAt(i)-'a']--;
            string2[s2.charAt(i + s1.length())-'a']++;
        }
        if(Arrays.equals(string1, string2)) return true;
        return false;
    }
}