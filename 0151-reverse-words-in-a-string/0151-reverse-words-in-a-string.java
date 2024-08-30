class Solution {
    public static void reverseWords(int start, int end, char[] charArray){
        while(start<=end){
            char temp = charArray[end];
            charArray[end] = charArray[start];
            charArray[start] = temp;
            start++;
            end--;
        }
    }
    public String reverseWords(String s) {
        char[] charArray = s.trim().toCharArray();
        int len = charArray.length;
        int start = 0;
        for(int end=0; end<len; end++){
            if(charArray[end]==' '){
                reverseWords(start, end-1, charArray);
                start = end+1;
            }
        }
        reverseWords(start, len-1, charArray);
        reverseWords(0, len-1, charArray);
            s = new String(charArray);
            return String.join(" ", s.split("\\s+"));
    }

}