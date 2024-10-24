class Pair implements Comparable<Pair>{
    int key;
    int value;

    Pair(int key, int value){
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Pair p){
        if(this.key==p.key){
            return Integer.compare(this.value, p.value);
        }else{
            return Integer.compare(this.key, p.key);
        }
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<arr.length; i++){
            int z = Math.abs(x-arr[i]);
            maxHeap.add(new Pair(z, arr[i]));
            if(maxHeap.size()> k) maxHeap.poll();
        }
        List<Integer> list = new ArrayList<>();
        while(!maxHeap.isEmpty()){
           Pair p = maxHeap.poll();
           list.add(p.value);
        }
        Collections.sort(list);
        return list;
    }
}