class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int num: nums) set.add(num);
        int maxLength = 0;
        int length = 1;
        int[] arr = new int[set.size()];
        int j = 0;
        if(set.size()==0) return 0;
        for(int n : set) {
            arr[j] = n;
            System.out.println(arr[j]);
            j++;    
        }
        for(int i=1; i<set.size(); i++){
            if(arr[i]==arr[i-1]+1) length++;
            else{
                maxLength = Math.max(maxLength, length);
                length=1;
            }
        }
        maxLength = Math.max(maxLength, length);
        return maxLength;
    }
}