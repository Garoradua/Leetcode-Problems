class Solution {
    public int countCollisions(String directions) {
        int rightCount = 0;
        int collission = 0;
        boolean started = false;
        for(char car : directions.toCharArray()){
            if(car!='L')started=true;
            if(car=='R') rightCount++;
            else if(car=='L'){
                if(rightCount > 0){
                    collission += rightCount + 1;
                    rightCount = 0;
                }else{
                    if(started==true) collission+=1;
                }
            }else{
                if(rightCount >0){
                    collission += rightCount;
                    rightCount = 0;
                }
            }
        }

        return collission;
    }
}