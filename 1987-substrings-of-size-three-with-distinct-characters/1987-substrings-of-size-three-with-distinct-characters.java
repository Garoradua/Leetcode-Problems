class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length() <3) return 0;
        char first = s.charAt(0);
        char second = s.charAt(1);
        char third = s.charAt(2);
        int count  = 0;
        if(first !=second && first != third && third!= second ) count++;
        for(int i=3; i<s.length(); i++){
            first = second;
            second = third;
            third = s.charAt(i);
            if(first !=second && first != third && third!= second ) count++;
        }
        return count;
    }
}