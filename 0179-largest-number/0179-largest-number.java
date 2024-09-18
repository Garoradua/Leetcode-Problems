class Solution {
    public String largestNumber(int[] nums) {
       String greaterNumber[] = new String[nums.length];
       for(int i=0; i<nums.length; i++){
        greaterNumber[i] = String.valueOf(nums[i]);
       }

       Arrays.sort(greaterNumber, (a,b) -> (b+a).compareTo(a+b));
    StringBuilder result = new StringBuilder();
      for(int i=0; i<greaterNumber.length; i++){
        result.append(greaterNumber[i]);
       }  
        return result.charAt(0)=='0' ?  "0" :  result.toString() ;
    }
}