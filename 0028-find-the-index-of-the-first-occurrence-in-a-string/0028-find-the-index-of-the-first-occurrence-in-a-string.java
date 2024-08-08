class Solution {
    public int strStr(String haystack, String needle) {
        int hayLength = haystack.length();
        int needLength = needle.length();
        if(needLength==0) return -1;
        for(int i=0; i<=hayLength-needLength; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
            int j=0;
            while(j < needLength){
                if(needle.charAt(j)!=haystack.charAt(j+i)) break;
                j++;
                }
                if(j==needLength) return i;
            }
            
        }
        return -1;
    }
}