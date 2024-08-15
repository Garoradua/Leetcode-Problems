class Solution {
    public int scoreOfString(String s) {
        int diff = 0;
        if(s.length()<2) return (int)s.charAt(0);
       for(int i=1; i<s.length(); i++){
        int count1 = s.charAt(i);
        int count2 = s.charAt(i-1);
        diff += Math.abs(count1 - count2);
       } 
       return diff;
    }
}