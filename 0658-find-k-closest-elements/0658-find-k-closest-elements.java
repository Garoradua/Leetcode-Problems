class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low = 0;
        int high = arr.length-1;
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while(high-low >=k){
            if(Math.abs(arr[low]-x) > Math.abs(arr[high]-x)){
                low++;
            }else{
                high--;
            }
        }
        for( i=low; i<=high; i++)
        list.add(arr[i]);


        return list;
    }
}