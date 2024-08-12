class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count=0;
        int n = colors.length;
        int i = 0;
        for(i=0; i<colors.length-2; i++){
            if(colors[i] != colors[i+1] && colors[i+1]!=colors[i+2]) count++;
        }
        if(i==n-2){
            if(colors[i] != colors[i+1] && colors[i+1] != colors[0]) count++;
            i++;
        }
        if(i==n-1){
            if(colors[i] != colors[0] && colors[0] != colors[1]) count++;
        }

        return count;
    }
}