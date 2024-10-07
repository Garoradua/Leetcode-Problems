class Solution {
    public int characterReplacement(String s, int k) {
        int max_length = 0;
        for(char c = 'A'; c <= 'Z' ; c++ ){
            int left = 0;  int size = s.length(); int replaced = 0;
            int right = 0;
            while(right < size){
                if(c==s.charAt(right)) right++;
                else if ( replaced < k ) {
                    right++;
                    replaced++;
                }else if(c==s.charAt(left)) left++;
                else {
                    left++;
                    replaced--;
                }
                max_length = Math.max(max_length, right-left);
            }
        }
        return max_length;
    }
}