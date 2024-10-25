class Pair implements Comparable<Pair>{
    int key;
    int frequency;

    Pair(int key, int frequency){
        this.key = key;
        this.frequency = frequency;
    }

    public int compareTo(Pair p){
        if(this.frequency == p.frequency){
            return p.key - this.key;
        }
        return this.frequency - p.frequency;
    }
}

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Pair> minHeap = new PriorityQueue<>();

        for(int key : map.keySet()){
            int frequency = map.get(key);
            minHeap.add(new Pair(key, frequency));
        }
         int j = 0;

         while(!minHeap.isEmpty()){
            Pair p = minHeap.poll();
            for(int i=0; i<p.frequency; i++){
                nums[j++] = p.key;
            }
         }

         return nums;
    }
}