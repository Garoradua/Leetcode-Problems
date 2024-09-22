class Solution {
    public int findKthNumber(int n, int k) {
        k = k-1;
        int steps;
        int currentNumber = 1;
        while(k>0){
            steps = getNoOfSteps(n, currentNumber);
            if(steps <= k){
                currentNumber += 1;
                k = k-steps;
            }else{
                currentNumber *= 10;
                k -= 1;
            }
        }
        return currentNumber;
    }
    public static int getNoOfSteps(long n, long currentNumber){
        long nextNumber = currentNumber + 1;
        int steps = 0;
        while(currentNumber <=n){
            if(nextNumber <=n){
                steps += nextNumber - currentNumber;
            }else{
                steps += n-currentNumber +1;
            }
            currentNumber *= 10;
            nextNumber *= 10;
        }
        return steps;
    }
}