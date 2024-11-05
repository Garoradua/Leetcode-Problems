class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[1] - b[1]);
        int current = intervals[0][1];
        int res = 0;
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] < current) res++;
            else{
                current = intervals[i][1];
            }
        }

        return res;
    }
}

// class Pair{
//     int startTime;
//     int endTime;

//     Pair(int startTime, int endTime){
//         this.startTime = startTime;
//         this.endTime = endTime;
//     }


// }