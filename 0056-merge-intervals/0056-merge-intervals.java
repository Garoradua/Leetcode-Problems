class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]> result = new ArrayList<>();
        List<Integer> temp;
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        for(int i=0; i<n; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(!result.isEmpty() && result.get(result.size() - 1)[1] >= start) {
                continue;
            }
            for(int j=i+1; j<n; j++){
                if(intervals[j][0] > end){
                    break;
                }
                if(intervals[j][1] > end){
                    end = intervals[j][1];
                }
            }

           result.add(new int[]{start, end});
        }
         return result.toArray(new int[result.size()][]);
    }
}