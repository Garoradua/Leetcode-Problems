class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] charArray = s.toCharArray();
        int totalLength = charArray.length;
        int j;
        if(charArray[totalLength-1]=='0') j = totalLength-1;
        else j=0;
            for(int i=0; i<totalLength-1; i++){
                if(charArray[i]=='1'){
                    swap(j,i,charArray);
                    if(j == totalLength-1) j=0;
                    else j++;
                }
            }
        return new String(charArray);
    }
    public void swap(int i, int j, char[] charArray){
        char x = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = x;
    }
}