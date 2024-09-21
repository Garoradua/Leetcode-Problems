class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        int i=1;
        for(int j=1; j<=n; j++){
            result.add(i);
            if(i*10 <=n){
                i *=10;
            }else{
               while(i%10==9 || i==n){
                i = i/10;
               }
                i++;
            }
        }
        return result;
    }
}