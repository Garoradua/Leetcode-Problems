class Pair implements Comparable<Pair>{
    int closest;
    int[] value;

    Pair(int closest, int[] value){
        this.closest = closest;
        this.value = value;
    }

    @Override
    public int compareTo(Pair p){
        return this.closest - p.closest;
    }

}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int len = points.length;

        for(int i=0; i<len; i++){
            int val1 = points[i][0];
            val1 = val1*val1;

            int val2 = points[i][1];
            val2 = val2*val2;

            maxHeap.add(new Pair(val1+val2, points[i]));
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int result[][] = new int[k][2];
        int i = 0;
        while(!maxHeap.isEmpty()){
            Pair p = maxHeap.poll();
            result[i++] = p.value;
        }

        return result;
    }
}