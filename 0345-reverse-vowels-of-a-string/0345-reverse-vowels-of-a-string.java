class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] str = s.toCharArray();
        while(start<end){
            if(!vowels(str[start])){
                start++;
            }else if(!vowels(str[end])){
                end--;
            }else{
                char x = str[start];
                str[start] = str[end];
                str[end] = x;
                start++;
                end--;
            }
        }
        s = new String(str);
        return s;
    }
    public  boolean vowels(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') return true;
        return false;
    }
}