
class Solution {
    int[] arr;
    int[] org_array;
    Random rand = new Random();
    public Solution(int[] nums) {
        arr = new int[nums.length];
        org_array = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i];
            org_array[i] = nums[i];
        }
    }
    
    public int[] reset() {
        return org_array;
    }
    
    public int[] shuffle() {
        int length = arr.length;
        int randomNumber = rand.nextInt(length);
        int next = randomNumber-1;
        if(randomNumber == 0){
            next = arr.length-1;
        }
        int z = arr[randomNumber];
        arr[randomNumber] = arr[next];
        arr[next] = z;
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */