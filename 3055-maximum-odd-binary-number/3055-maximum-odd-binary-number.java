class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr = s.toCharArray();
        int length  =arr.length;
        int left = 0;
        int right = length-1;

        while(left<=right){
            if(arr[left]=='1') left++;
            else if(arr[right]=='0') right--;
            else {
                arr[left] = '1';
                arr[right] = '0';
                left++;
                right--;
            }
        }
        arr[right] = '0';
        arr[length-1] = '1';
        return new String(arr);
    }
}