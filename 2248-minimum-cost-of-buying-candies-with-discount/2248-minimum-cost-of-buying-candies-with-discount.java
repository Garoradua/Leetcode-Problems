class Solution {
    public int minimumCost(int[] cost) {
      Arrays.sort(cost);
      int i = cost.length-1;
      int price= 0;
        while(i >=1){
            price += cost[i--];
            price += cost[i--];
            i--;
        }
        if(i==0) price += cost[i];


        return price;
    }
}