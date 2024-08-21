class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        // Arrays.sort(points, (a,b) ->{
        //     return (a[0] - b[0]);
        // });
        int n = points.length;
        int[] xCoordinates = new int[n];
        for(int i=0; i<n; i++){
            xCoordinates[i] = points[i][0];
        }
        Arrays.sort(xCoordinates);
        int ans = 0;
        for(int i=1; i<n; i++){
            ans = Math.max(ans, xCoordinates[i] - xCoordinates[i-1]);
        }
        return ans;
    }
}