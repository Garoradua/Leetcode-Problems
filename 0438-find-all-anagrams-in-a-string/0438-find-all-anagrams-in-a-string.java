class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pArray = new int[26];
        int[] sArray = new int[26];
         List<Integer> list = new ArrayList<>();
        if(p.length() > s.length()) return list;
        for(int i=0; i<p.length(); i++){
            pArray[p.charAt(i)-'a']++;
            sArray[s.charAt(i)-'a']++;
        }
       
        int i = 0;
        for(i=0; i<s.length() - p.length(); i++){
            if(Arrays.equals(pArray, sArray)) list.add(i);
            sArray[s.charAt(i)-'a']--;
            sArray[s.charAt(i + p.length())-'a']++;
        }
        if(Arrays.equals(pArray, sArray)) list.add(i);
        return list;
    }
}