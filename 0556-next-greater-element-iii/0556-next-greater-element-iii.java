class Solution {
    public int nextGreaterElement(int n) {
        int[] number = convertArray(n);
        
        int len = number.length;
        // for(int i=0; i<number.length; i++) System.out.println(number[i]);
        // return 0;
        int i;
        for(i=len-2; i>=0; i--){
            if(number[i] < number[i+1]){
                break;
            }
        }
        if(i<0) return -1;
        int j;
        for(j=len-1; j>i; j--){
            if(number[j] > number[i]){
                break;
            }
        }
        swap(i, j, number);
        //change all remaining
        int start = i+1;
        int end = len-1;
        while(start < end){
            swap(start, end, number);
            start++;
            end--;
        }
        long finalNumber = 0; //2443
        for(i=0; i<number.length; i++){
            finalNumber = finalNumber*10 + number[i];
            if(finalNumber>Integer.MAX_VALUE) return -1;
        }
        return (int)finalNumber;
    }
    public void swap(int i, int j, int[] number){
        int data = number[i];
        number[i] = number[j];
        number[j] = data;
    }
    public int[] convertArray(int n){
        char[] number = String.valueOf(n).toCharArray();
        int len = number.length;
        int[] result = new int[len];
        for(int i = 0; i<len; i++){
            result[i] = Character.getNumericValue(number[i]);
        }
        return result;
    }
}