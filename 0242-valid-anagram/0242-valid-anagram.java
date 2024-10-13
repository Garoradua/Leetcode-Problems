class Solution {
    public boolean isAnagram(String s, String t) {
        int lengthS = s.length();
        int lengthT = t.length();

        if(lengthS != lengthT) return false;

        Map<Character, Integer> map = new HashMap<>();

        for(char x : s.toCharArray()) map.put(x, map.getOrDefault(x, 0) +1);
        for(char x : t.toCharArray()) map.put(x, map.getOrDefault(x, 0) -1);

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() != 0) return false;
        }
        return true;
    }
}