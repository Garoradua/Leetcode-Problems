class Cars{
    int position;
    double timeToTarget;

    Cars(int position, double timeToTarget){
        this.position = position;
        this.timeToTarget = timeToTarget;
    }
}
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        Cars[] car = new Cars[n];

        for(int i=0; i<n; i++){
            car[i] = new Cars(position[i], (target-position[i])*1.0/speed[i]);
        }

        Arrays.sort(car, new Comparator<Cars>(){
            public int compare(Cars A, Cars B){
                return A.position - B.position;
            }
        });
        int ans = 0;
        for(int i=n-1; i>=1; i--){
            if(car[i].timeToTarget >= car[i-1].timeToTarget){
                car[i-1] = car[i];
            }else{
                ans++;
            }
        }
        return ans+1;
    }
}