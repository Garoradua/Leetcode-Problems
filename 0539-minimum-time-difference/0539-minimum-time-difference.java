class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> mins = new ArrayList<>();
        for(String time : timePoints){
            String[] t = time.split(":");
            int hour = Integer.parseInt(t[0]);
            int min = Integer.parseInt(t[1]);
            mins.add(hour*60+min);
        }

        Collections.sort(mins);
        int ans = Integer.MAX_VALUE;
        for(int i=1; i<mins.size(); i++){
            ans = Math.min(ans, mins.get(i)-mins.get(i-1));
        }

        //EDGE case
        ans = Math.min(ans, ((24*60)+mins.get(0))-mins.get(mins.size()-1));
        return ans;
    }
}