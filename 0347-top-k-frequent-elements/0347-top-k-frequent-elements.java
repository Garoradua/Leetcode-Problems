class Pair implements Comparable<Pair>{
    int value;
    int frequency;

    Pair(int value, int frequency){
        this.value = value;
        this.frequency = frequency;
    }

    public int compareTo(Pair p){
        return this.frequency - p.frequency;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();
        for(int key : map.keySet()){
            int val = map.get(key);
            minHeap.add(new Pair(key, val));
            if(minHeap.size() > k) minHeap.poll();
        }

        int[] result  = new int[k];
            int i = 0;
            while(!minHeap.isEmpty()){
                Pair p = minHeap.poll();
                result[i++] = p.value;
            }
        return result;
    }
}